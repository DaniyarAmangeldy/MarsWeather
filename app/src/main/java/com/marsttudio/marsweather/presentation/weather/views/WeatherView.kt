package com.marsttudio.marsweather.presentation.weather.views

import com.arellomobile.mvp.MvpView
import com.marsttudio.marsweather.data.models.Weather

/**
 * Created by marsstudio on 14.07.17.
 */


interface WeatherView: MvpView {
    fun showLoading()
    fun hideLoading()
    fun setUpAdapterOrInsertItems(weatherList: List<Weather>)
    fun showErrorMessage(error: String)
}