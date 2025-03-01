package com.hedroid.aitarotreadingapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hedroid.aitarotreadingapp.Model.TarotReading
import com.hedroid.aitarotreadingapp.R


class ReadingAdapter : RecyclerView.Adapter<ReadingAdapter.ViewHolder>() {
    private var readings: List<TarotReading> = emptyList()


    fun submitList(newReadings: List<TarotReading>) {
        readings = newReadings
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dateText: TextView = view.findViewById(R.id.dateText)
        val questionText: TextView = view.findViewById(R.id.questionText)
        val cardsText: TextView = view.findViewById(R.id.cardsText)
        val interpretationText: TextView = view.findViewById(R.id.interpretationText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_reading, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val reading = readings[position]
        holder.dateText.text = reading.date
        holder.questionText.text = "Q: ${reading.question}"
        holder.cardsText.text = "Cards: ${reading.cards}"
        holder.interpretationText.text = "Interpretation: ${reading.interpretation}"
    }

    override fun getItemCount() = readings.size
}
