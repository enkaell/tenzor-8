package com.example.myexample.data

import com.example.myexample.R
import com.example.myexample.ui.animationprofile.model.Element

object ElementRepository {

    val elements: List<Element> = listOf(
        Element(1, R.drawable.ic_putin, "Vladimir Putin"),
        Element(2, R.drawable.ic_hohol, "Vladimir Zelenskyi"),
        Element(3, R.drawable.ic_genji, "Genji"),
        Element(5, R.drawable.ic_mas, "Masyanya"),
        Element(6, R.drawable.ic_mem, "Upyachka"),
        Element(7, R.drawable.ic_pivo, "Ryan Gosling"),
    )
}
