package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.progra32022.adapter.PresentationCardAdapter
import com.example.progra32022.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    private val presentationCardAdapter by lazy { PresentationCardAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setRecyclerView()
    }

    fun setRecyclerView(){

        val mutablelist = mutableListOf<String>()
        mutablelist.add("A")
        mutablelist.add("B")
        mutablelist.add("C")
        mutablelist.add("D")
        mutablelist.add("E")
        mutablelist.add("F")
        mutablelist.add("G")
        mutablelist.add("H")

        presentationCardAdapter.addPresentationCards(mutablelist)

        binding.recyclerExample.apply {
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = presentationCardAdapter
        }

    }
}