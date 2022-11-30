package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.progra32022.databinding.ActivityPresentationCardBinding

class PresentationCardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPresentationCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPresentationCardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}