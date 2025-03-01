package com.hedroid.aitarotreadingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hedroid.aitarotreadingapp.Model.TarotCard
import com.hedroid.aitarotreadingapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val selectedCards = intent.getParcelableArrayListExtra<TarotCard>("selected_cards")


        selectedCards?.let {
            if (it.size >= 3) {
                binding.ivCard1.setImageResource(it[0].imageResId)
                binding.tvCard1Interpretation.text = it[0].interpretation ?: "Interpretation not available"

                binding.ivCard2.setImageResource(it[1].imageResId)
                binding.tvCard2Interpretation.text = it[1].interpretation ?: "Interpretation not available"

                binding.ivCard3.setImageResource(it[2].imageResId)
                binding.tvCard3Interpretation.text = it[2].interpretation ?: "Interpretation not available"
            }
        }


        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}