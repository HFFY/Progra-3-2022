package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.progra32022.R
import com.example.progra32022.databinding.ActivityLinearHomeworkBinding

class LinearHomeworkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLinearHomeworkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinearHomeworkBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}