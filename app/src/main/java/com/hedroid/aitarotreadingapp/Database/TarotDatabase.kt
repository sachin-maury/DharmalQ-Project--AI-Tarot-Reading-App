package com.hedroid.aitarotreadingapp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hedroid.aitarotreadingapp.Model.TarotReading


@Database(entities = [TarotReading::class], version = 1, exportSchema = false)
abstract class TarotDatabase : RoomDatabase() {
    abstract fun tarotReadingDao(): TarotReadingDao

    companion object {
        @Volatile
        private var INSTANCE: TarotDatabase? = null


        fun getDatabase(context: Context): TarotDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TarotDatabase::class.java,
                    "tarot_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
