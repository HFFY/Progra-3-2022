package com.example.progra32022.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.progra32022.R
import com.example.progra32022.dataClasses.Estudiante
import com.example.progra32022.dataClasses.Restaurante
import com.example.progra32022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var num = 0

    companion object{
        val MESSAGE: String = "new_message"
        val ESTUDIANTE: String = "Estudiante"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val text0 = getString(R.string.activity_change)
        val text: String = binding.textTitle.text.toString()

        binding.textViewSetText.text = getText(R.string.ejemplo_parrafo)
        binding.imageSetImage.setImageResource(R.drawable.ic_canon)

        binding.buttonSave.setOnClickListener {
            changeText()
        }

        binding.buttonActivityChange.setOnClickListener {
//            val estudiante = Estudiante(
//                "Nombre",
//                null,
//                "Apellido P",
//                "Apellido M",
//                "10/10/2000",
//                22,
//                "333333"
//            )
            val intent = Intent(this, JsonExampleActivity::class.java)
//            intent.putExtra(ESTUDIANTE,estudiante)
            startActivity(intent)
        }
    }

    fun changeText(){
        val texto = binding.editTextNumber.text.toString()
        binding.textTitle.text = "Nuevo número: $texto"
        binding.editTextNumber.setText("")
    }

    fun contador(){
        binding.textTitle.text = num.toString()
        num++
    }

    fun abiertos(listRestaurante: List<Restaurante>): List<Restaurante> {
        val abiertos = mutableListOf<Restaurante>()
        listRestaurante.forEach { restaurante ->

            if (restaurante.abierto)
                abiertos.add(restaurante)
        }
        return abiertos
    }

    fun abiertos2(listRestaurante: List<Restaurante>): List<Restaurante> {
        return listRestaurante.filter { it.abierto }
    }
}