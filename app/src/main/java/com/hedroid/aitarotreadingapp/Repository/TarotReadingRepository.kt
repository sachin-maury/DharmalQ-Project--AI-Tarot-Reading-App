package com.hedroid.aitarotreadingapp.Repository

import android.content.Context
import com.hedroid.aitarotreadingapp.Database.TarotDatabase
import com.hedroid.aitarotreadingapp.Model.TarotReading
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class TarotReadingRepository(context: Context) {
    private val tarotDao = TarotDatabase.getDatabase(context).tarotReadingDao()


    suspend fun saveReading(reading: TarotReading) {
        withContext(Dispatchers.IO) {
            tarotDao.insertReading(reading)
        }
    }


    suspend fun getReadings(): List<TarotReading> {
        return withContext(Dispatchers.IO) {
            tarotDao.getAllReadings()
        }
    }
}
