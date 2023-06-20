package com.example.application_animal_shelter.ui.news

import java.util.ArrayList
import java.util.HashMap

object NewsContent {

    val ITEMS: MutableList<PlaceholderItem> = ArrayList()

    private val ITEM_MAP: MutableMap<String, PlaceholderItem> = HashMap()

    private const val COUNT = 10

    init {
        for (i in 1..COUNT) {
            addItem(createPlaceholderItem(i))
        }
    }

    private fun addItem(item: PlaceholderItem) {
        ITEMS.add(item)
        ITEM_MAP[item.id] = item
    }

    private fun createPlaceholderItem(position: Int): PlaceholderItem {
        return PlaceholderItem(position.toString(), "News $position", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dignissim.", "2023.05.$position")
    }

    data class PlaceholderItem(val id: String, val title: String, val desc: String, val date: String)
}