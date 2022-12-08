package com.example.progra32022.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.progra32022.R
import com.example.progra32022.databinding.ItemPresentationCardBinding

class PresentationCardAdapter :
    RecyclerView.Adapter<PresentationCardAdapter.PresentationCardViewHolder>() {

    private val presentationCard = mutableListOf<String>()
    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PresentationCardViewHolder {
        context = parent.context
        return PresentationCardViewHolder(
            ItemPresentationCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: PresentationCardViewHolder, position: Int) {
        holder.binding(presentationCard[position])
    }

    override fun getItemCount(): Int = presentationCard.size

    inner class PresentationCardViewHolder(private val binding: ItemPresentationCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binding(data: String) {
            binding.textViewName.text = data
            binding.imageProfile.setImageResource(R.drawable.vamoacalmarno)
            binding.textViewHobie.text = context?.getText(R.string.hobie)
        }
    }

    fun addPresentationCards(list: List<String>) {
        presentationCard.clear()
        presentationCard.addAll(list)
    }
}