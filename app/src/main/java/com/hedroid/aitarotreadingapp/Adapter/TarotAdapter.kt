package com.hedroid.aitarotreadingapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hedroid.aitarotreadingapp.Model.TarotCard
import com.hedroid.aitarotreadingapp.databinding.ItemTarotCardBinding

class TarotAdapter(
    private val tarotList: List<TarotCard>,
    private val onCardClick: (TarotCard) -> Unit
) : RecyclerView.Adapter<TarotAdapter.TarotViewHolder>() {

    inner class TarotViewHolder(private val binding: ItemTarotCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(card: TarotCard) {
            binding.cardName.text = card.name
            binding.cardImage.setImageResource(card.imageResId)

            binding.root.setOnClickListener {
                onCardClick(card)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarotViewHolder {
        val binding = ItemTarotCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TarotViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TarotViewHolder, position: Int) {
        holder.bind(tarotList[position])
    }

    override fun getItemCount(): Int = tarotList.size
}