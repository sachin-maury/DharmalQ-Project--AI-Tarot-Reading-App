package com.hedroid.aitarotreadingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.hedroid.aitarotreadingapp.Adapter.TarotAdapter
import com.hedroid.aitarotreadingapp.ListofCard.TarotCardRepository
import com.hedroid.aitarotreadingapp.Model.TarotCard
import com.hedroid.aitarotreadingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val selectedCards = mutableListOf<TarotCard>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        selectedCards.clear()

        setupRecyclerView()


        binding.btnViewPastReadings.setOnClickListener {
            val intent = Intent(this, PastReadingsActivity::class.java)
            startActivity(intent)
        }


    }

    private fun setupRecyclerView() {
        binding.rvTarotDeck.layoutManager = GridLayoutManager(this, 4)
        val adapter = TarotAdapter(TarotCardRepository.tarotCards) { card ->
            selectCard(card)
        }
        binding.rvTarotDeck.adapter = adapter
    }

    private fun selectCard(card: TarotCard) {
        if (selectedCards.size < 3) {
            selectedCards.add(card)
            if (selectedCards.size == 3) {
                val intent = Intent(this, ResultActivity::class.java).apply {
                    putParcelableArrayListExtra("selectedCards", ArrayList(selectedCards))
                }
                startActivity(intent)
            }
        } else {
            Toast.makeText(this, "You can only select 3 cards!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onResume() {
        super.onResume()
        selectedCards.clear()
    }
}
