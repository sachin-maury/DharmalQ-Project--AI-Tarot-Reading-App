package com.hedroid.aitarotreadingapp.Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TarotCard(
    val id: Int,
    val name: String,
    val interpretation: String,
    val imageResId: Int
) : Parcelable