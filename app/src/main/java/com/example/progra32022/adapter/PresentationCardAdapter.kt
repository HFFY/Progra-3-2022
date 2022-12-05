package com.example.progra32022.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.progra32022.databinding.ItemPresentationCardBinding

class PresentationCardAdapter :
    RecyclerView.Adapter<PresentationCardAdapter.PresentationCardViewHolder>() {

    private val presentationCard = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PresentationCardViewHolder =
        PresentationCardViewHolder(
            ItemPresentationCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: PresentationCardViewHolder, position: Int) {
        holder.binding(presentationCard[position])
    }

    override fun getItemCount(): Int = presentationCard.size

    inner class PresentationCardViewHolder(private val binding: ItemPresentationCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binding(data: String) {
            binding.textViewName.text = data
        }
    }

    fun addPresentationCards(list: List<String>) {
        presentationCard.clear()
        presentationCard.addAll(list)
    }
}