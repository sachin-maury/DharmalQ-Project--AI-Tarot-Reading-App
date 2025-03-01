package com.hedroid.aitarotreadingapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hedroid.aitarotreadingapp.Adapter.ReadingAdapter
import com.hedroid.aitarotreadingapp.Repository.TarotReadingRepository
import kotlinx.coroutines.launch


class PastReadingsActivity : AppCompatActivity() {
    private lateinit var readingAdapter: ReadingAdapter
    private lateinit var repository: TarotReadingRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_past_readings)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewPastReadings)
        recyclerView.layoutManager = LinearLayoutManager(this)
        readingAdapter = ReadingAdapter()
        recyclerView.adapter = readingAdapter

        repository = TarotReadingRepository(this)


        lifecycleScope.launch {
            val readings = repository.getReadings()
            if (readings.isEmpty()) {
                Toast.makeText(this@PastReadingsActivity, "No past readings found", Toast.LENGTH_SHORT).show()
            } else {
                readingAdapter.submitList(readings)
            }
        }
    }
}
