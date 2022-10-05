package com.example.wishlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.wishlist.databinding.ActivityMainBinding
import com.example.wishlist.ui.addGroup.GroupFragment
import com.example.wishlist.ui.mainScreen.BottomSheet
import com.example.wishlist.ui.mainScreen.MAIN_SCREEN_TAG
import com.example.wishlist.ui.mainScreen.MainScreenFragment

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by viewBinding(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, MainScreenFragment(), MAIN_SCREEN_TAG)
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
                handleAddWishButtonOnClick()
            }
        }
    }

    private fun handleBottomAppBarNavigationIconOnClick() {
        binding.bottomAppBar.setNavigationOnClickListener {
            supportActionBar?.elevation = 0f
            BottomSheet().show(supportFragmentManager, "TAG")
        }
    }

    private fun handleAddWishButtonOnClick() {
        binding.addGroup.setOnClickListener {
            binding.mainFab.isExpanded = false
            binding.mainFab.setImageResource(R.drawable.ic_add)
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container, GroupFragment(), "TAG2")
                .addToBackStack(null).commit()
        }
    }

}