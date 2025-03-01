package com.hedroid.aitarotreadingapp.Model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tarot_readings")
data class TarotReading(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val date: String,  // Stores the date of the reading
    val question: String,  // Stores the user's question
    val cards: String,  // Stores the selected tarot cards
    val interpretation: String  // Stores the interpretation of the cards
)
