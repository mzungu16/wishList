package com.example.wishlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.wishlist.databinding.ActivityMainBinding
import com.example.wishlist.ui.mainScreen.BottomSheet
import com.example.wishlist.ui.mainScreen.MAIN_SCREEN_TAG
import com.example.wishlist.ui.mainScreen.MainScreenFragment

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by viewBinding(ActivityMainBinding::bind)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(MainScreenFragment(), MAIN_SCREEN_TAG)
            .addToBackStack(null)
            .commit()
        handleBottomAppBarNavigationIconOnClick()

        binding.mainFab.setOnClickListener {
            if (binding.mainFab.isExpanded) {
                binding.mainFab.isExpanded = false
                binding.mainFab.setImageResource(R.drawable.ic_add)
            } else {
                binding.mainFab.isExpanded = true
                binding.mainFab.setImageResource(R.drawable.ic_close)
            }
        }
    }

    private fun handleBottomAppBarNavigationIconOnClick() {
        binding.bottomAppBar.setNavigationOnClickListener {
            supportActionBar?.elevation = 0f
            BottomSheet().show(supportFragmentManager, "TAG")
        }
    }

}