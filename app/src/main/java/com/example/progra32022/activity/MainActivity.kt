package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.progra32022.R
import com.example.progra32022.dataClasses.Restaurante

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.text_title)
        textView.text = "Hola Mundo"
    }

    fun abiertos(listRestaurante: List<Restaurante>): List<Restaurante>{
        val abiertos = mutableListOf<Restaurante>()
        listRestaurante.forEach { restaurante ->
            if (restaurante.abierto)
                abiertos.add(restaurante)
        }
        return abiertos
    }

    fun abiertos2(listRestaurante: List<Restaurante>): List<Restaurante>{
        return listRestaurante.filter { it.abierto }
    }
}