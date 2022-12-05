package com.example.progra32022.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.progra32022.adapter.PresentationCardAdapter
import com.example.progra32022.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    private val presentationCardAdapter by lazy { PresentationCardAdapter() }
    private val presentationCardAdapter2 by lazy { PresentationCardAdapter() }

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

        val mutablelist2 = mutableListOf<String>()
        mutablelist2.add("I")
        mutablelist2.add("J")
        mutablelist2.add("K")
        mutablelist2.add("L")
        mutablelist2.add("M")
        mutablelist2.add("N")
        mutablelist2.add("O")
        mutablelist2.add("P")

        presentationCardAdapter2.addPresentationCards(mutablelist2)

        binding.recyclerExample.apply {
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = presentationCardAdapter
        }

        binding.recyclerExample2.apply {
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = presentationCardAdapter2
        }
    }
}