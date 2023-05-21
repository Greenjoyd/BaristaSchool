package com.greenjoyd.repository

import android.content.Context
import android.graphics.drawable.Drawable
import com.greenjoyd.baristaschoolav.R

class RepositoryInMemory(private val context: Context) {
private val drinkMap: Map<String, Int> = mapOf(
    "americano" to R.string.americano,
    "cappuch" to R.string.capuch,
    "espresso" to R.string.espresso,
    "flat" to R.string.flat,
    "latte" to R.string.latte,
    "cold" to R.string.coldBrew,
    "brew" to R.string.Brew,
    "raf" to R.string.raf,
    "chemex" to R.string.chemex,
    "french" to R.string.franch,
    "geyser" to R.string.Mocca,
    "hario" to R.string.Hario,
    "coffeeMachine" to R.string.machine,
    "pour" to R.string.pour,
    "bumble" to R.string.bumble
)

private val imageMap: Map<String, Int> = mapOf(
    "americano" to R.drawable.americanophoto,
    "cappuch" to R.drawable.capuch,
    "espresso" to R.drawable.espressophoto,
    "flat" to R.drawable.flatwhite,
    "latte" to R.drawable.lattephoto,
    "cold" to R.drawable.coldphoto,
    "brew" to R.drawable.brewratio,
    "raf" to R.drawable.rafphoto,
    "chemex" to R.drawable.chemexphoto,
    "french" to R.drawable.frenchphoto,
    "geyser" to R.drawable.mocca,
    "hario" to R.drawable.hariophoto,
    "coffeeMachine" to R.drawable._023_04_19_16_48_51,
    "pour" to R.drawable.pour,
    "bumble" to R.drawable.bumble
)

fun getDrinkText(drinkKey: String): String? {
    val stringResId = drinkMap[drinkKey]
    return stringResId?.let { context.getString(it) }
}

fun getDrinkImage(drinkKey: String): Drawable? {
    val imageResId = imageMap[drinkKey]
    return imageResId?.let { context.getDrawable(it) }
}


}


