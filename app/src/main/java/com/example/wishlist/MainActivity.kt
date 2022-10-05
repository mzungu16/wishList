package com.example.wishlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.wishlist.databinding.ActivityMainBinding
import com.example.wishlist.ui.mainScreen.BottomSheet

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by viewBinding(ActivityMainBinding::bind)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handleBottomAppBarNavigationIconOnClick()

        binding.mainFab.setOnClickListener {
            binding.mainFab.isExpanded = !binding.mainFab.isExpanded
        }
    }

    private fun handleBottomAppBarNavigationIconOnClick() {
        binding.bottomAppBar.setNavigationOnClickListener {
            supportActionBar?.elevation = 0f
            BottomSheet().show(supportFragmentManager, "TAG")
        }
    }

}