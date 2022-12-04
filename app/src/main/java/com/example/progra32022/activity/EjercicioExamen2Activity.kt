package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.progra32022.databinding.ActivityEjercicioExamen2Binding

class EjercicioExamen2Activity : AppCompatActivity() {

    lateinit var binding: ActivityEjercicioExamen2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicioExamen2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}