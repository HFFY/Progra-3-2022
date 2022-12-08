package com.example.progra32022.activity

import android.app.Dialog
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.preference.PreferenceManager
import com.example.progra32022.R
import com.example.progra32022.databinding.ActivitySmallItemsBinding
import com.example.progra32022.databinding.ItemPopupMessageBinding

class SmallItemsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySmallItemsBinding
    private lateinit var bindingPopup: ItemPopupMessageBinding
    private lateinit var preference: SharedPreferences
    var spinnerSelected = ""
    var radioSelected = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmallItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initSpinner()
        managePreferences()

        binding.buttonShowPopup.setOnClickListener {
            managePopup()
        }
    }

    fun initSpinner(){
        val dataList = mutableListOf<String>()
        dataList.add("Spinner Test A")
        dataList.add("Spinner Test B")
        dataList.add("Spinner Test C")
        dataList.add("Spinner Test D")
        dataList.add("Spinner Test E")

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            dataList
        )

        binding.spinner.adapter = adapter
        binding.spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                binding.textViewSelectedSpinner.text = dataList[position]
                spinnerSelected = dataList[position]
                Toast.makeText(this@SmallItemsActivity,"Seleccionaste algo", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }
    }

    fun managePreferences(){
        val id = "Nuestro_ID"
        preference = PreferenceManager.getDefaultSharedPreferences(this)
        binding.buttonSave.setOnClickListener {
            val editor = preference.edit()
            var savedData = ""
            if (binding.checkbox.isChecked)
             savedData = "$radioSelected $spinnerSelected"
            else
                savedData = radioSelected
            editor.putString(id, savedData)
            editor.apply()

        }
        binding.buttonShow.setOnClickListener {
            val data = preference.getString(id,"No hay nada")
            binding.textSavedData.text = "${getString(R.string.saved_data)} $data"
        }
        binding.buttonDelete.setOnClickListener {
            val editor = preference.edit()
            editor.remove(id)
            editor.apply()
        }
    }

    fun managePopup(){
        bindingPopup = ItemPopupMessageBinding.inflate(layoutInflater)
        val dialog = Dialog(this)
        dialog.setContentView(bindingPopup.root)
        dialog.setCancelable(true)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        bindingPopup.textTitle.text = "Hola"

        dialog.show()
        bindingPopup.buttonPopup.setOnClickListener {
            dialog.dismiss()
        }

    }
}