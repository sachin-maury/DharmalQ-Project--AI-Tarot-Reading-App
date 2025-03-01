package com.hedroid.aitarotreadingapp.Database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.hedroid.aitarotreadingapp.Model.TarotReading


@Dao
interface TarotReadingDao {
    @Insert
    suspend fun insertReading(reading: TarotReading)

    @Query("SELECT * FROM tarot_readings ORDER BY id DESC")
    suspend fun getAllReadings(): List<TarotReading>
}
