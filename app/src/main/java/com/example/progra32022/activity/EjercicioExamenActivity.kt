package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.progra32022.databinding.ActivityEjercicioExamenBinding

class EjercicioExamenActivity : AppCompatActivity() {

    lateinit var binding: ActivityEjercicioExamenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicioExamenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}