package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.progra32022.R
import com.example.progra32022.databinding.ActivityRelativeLayoutBinding

class RelativeLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRelativeLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRelativeLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}