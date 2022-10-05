package com.example.wishlist.ui.addGroup

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.wishlist.R
import com.example.wishlist.databinding.FragmentGroupBinding

class GroupFragment : Fragment(R.layout.fragment_group) {
    private val binding: FragmentGroupBinding by viewBinding(
        FragmentGroupBinding::bind
    )
}