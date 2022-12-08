package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.progra32022.activity.MainActivity.Companion.ESTUDIANTE
import com.example.progra32022.dataClasses.Estudiante
import com.example.progra32022.dataClasses.Persona
import com.example.progra32022.databinding.ActivityJsonExampleBinding
import com.google.gson.Gson
import com.google.gson.GsonBuilder

class JsonExampleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityJsonExampleBinding
    private lateinit var estudiante: Estudiante

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJsonExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        estudiante = Estudiante(
                "Nombre",
        null,
        "Apellido P",
        "Apellido M",
        "10/10/2000",
        22,
        "333333"
        )
//        estudiante = intent.getSerializableExtra(ESTUDIANTE) as Estudiante
        manageJson()
    }

    fun manageJson(){
        val gson = Gson()
        val gsonEstilizado = GsonBuilder().setPrettyPrinting().create()

        val dataOne = gson.toJson(estudiante)
        val dataTwo = gsonEstilizado.toJson(estudiante)

        binding.textViewExample.text = dataOne
        binding.textViewExamplePretty.text = dataTwo
    }
}