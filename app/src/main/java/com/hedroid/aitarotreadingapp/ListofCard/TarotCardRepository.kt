package com.hedroid.aitarotreadingapp.ListofCard

import com.hedroid.aitarotreadingapp.Model.TarotCard
import com.hedroid.aitarotreadingapp.R

object TarotCardRepository {
    private val cardData = listOf(
        Pair("The Fool", "New beginnings, spontaneity"),
        Pair("The Magician", "Power, skill, action"),
//        Pair("The High Priestess", "Wisdom, intuition"),
//        Pair("The Empress", "Abundance, nature"),
//        Pair("The Emperor", "Authority, structure"),
//        Pair("The Hierophant", "Tradition, spirituality"),
        Pair("The Lovers", "Love, relationships"),
        Pair("The Chariot", "Determination, control"),
        Pair("Strength", "Courage, inner power"),
        Pair("The Hermit", "Introspection, solitude"),
        Pair("Wheel of Fortune", "Luck, destiny"),
//        Pair("Justice", "Fairness, truth"),
//        Pair("The Hanged Man", "Letting go, new perspective"),
        Pair("Death", "Transformation, change"),
//        Pair("Temperance", "Balance, patience"),
//        Pair("The Devil", "Temptation, attachment"),
        Pair("The Tower", "Upheaval, sudden change"),
//        Pair("The Star", "Hope, inspiration"),
        Pair("The Moon", "Illusion, intuition"),
//        Pair("The Sun", "Happiness, success"),
        Pair("Judgment", "Rebirth, awakening"),
        Pair("The World", "Completion, accomplishment")
    )

    val tarotCards: List<TarotCard> = List(72) { index ->
        val card = cardData[index % cardData.size] // Reuse the cards cyclically
        TarotCard(index + 1, card.first, card.second, getCardImage(card.first))
    }.shuffled() // Shuffle the deck automatically

    private fun getCardImage(cardName: String): Int {
        return when (cardName) {
            "The Fool" -> R.drawable.the_fool
            "The Magician" -> R.drawable.the_magician
//            "The High Priestess" -> R.drawable.the_high_priestess
//            "The Empress" -> R.drawable.the_empress
//            "The Emperor" -> R.drawable.the_emperor
//            "The Hierophant" -> R.drawable.the_hierophant
            "The Lovers" -> R.drawable.the_lovers
            "The World" -> R.drawable.the_world
            "Two of Sea" -> R.drawable.tow_of_sea
            "Three of Cups" -> R.drawable.three_of_cups
            "Wheel of Fortune" -> R.drawable.wheel_of_fortune
//            "Justice" -> R.drawable.justice
//            "The Hanged Man" -> R.drawable.the_hanged_man
            "Death" -> R.drawable.the_death
//            "Temperance" -> R.drawable.temperance
//            "The Devil" -> R.drawable.the_devil
            "Queen of Wands" -> R.drawable.queen_of_wands
//            "The Star" -> R.drawable.the_star
            "The Moon" -> R.drawable.the_moon
//            "The Sun" -> R.drawable.the_sun
            "Two of Cups" -> R.drawable.two_of_cups
            "The World" -> R.drawable.the_world
            else -> R.drawable.default_card // Default image if not found
        }
    }
}