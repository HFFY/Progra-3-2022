package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.progra32022.databinding.ActivityPresentationCardBinding

class PresentationCardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPresentationCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPresentationCardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Glide.with(this).load("https://efeverde.com/wp-content/uploads/2022/01/Illimani.jpg").into(binding.imageBackground)
    }
}