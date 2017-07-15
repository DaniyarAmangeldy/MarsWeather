package com.marsttudio.marsweather.Utils

import android.content.Context
import com.marsttudio.marsweather.R

/**
 * Created by daniyaramangeldy on 15.07.17.
 */


private val EMPTY_TEXT = ""
fun Int.getMonthName(context: Context) = when(this) {
    0 -> context.getString(R.string.month_January)
    1 -> context.getString(R.string.month_February)
    2 -> context.getString(R.string.month_March)
    3 -> context.getString(R.string.month_April)
    4 -> context.getString(R.string.month_May)
    5 -> context.getString(R.string.month_June)
    6 -> context.getString(R.string.month_July)
    7 -> context.getString(R.string.month_August)
    8 -> context.getString(R.string.month_September)
    9 -> context.getString(R.string.month_October)
    10 -> context.getString(R.string.month_November)
    11 -> context.getString(R.string.month_December)
    else -> EMPTY_TEXT
}

