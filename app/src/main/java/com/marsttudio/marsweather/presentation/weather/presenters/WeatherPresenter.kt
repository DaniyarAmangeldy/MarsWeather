package com.marsttudio.marsweather.presentation.weather.presenters

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.marsttudio.marsweather.Application.App
import com.marsttudio.marsweather.data.models.Weather
import com.marsttudio.marsweather.di.weather.WeatherModule
import com.marsttudio.marsweather.domain.weather.WeatherInteractor
import com.marsttudio.marsweather.presentation.weather.views.WeatherView
import javax.inject.Inject

/**
 * Created by marsstudio on 14.07.17.
 */

@InjectViewState
class WeatherPresenter: MvpPresenter<WeatherView>() {

    val DEFAULT_PAGE = 1

    @Inject
    lateinit var weatherInteractor: WeatherInteractor

    init {

        App.graph.plus(WeatherModule()).inject(this)
    }

    fun loadWeatherList(page: Int = DEFAULT_PAGE) {
        showLoading()
        weatherInteractor.loadWeather(page)
                .subscribe(this::handleSuccessLoadWeatherList, this::handleErrorLoadWeatherList)
    }

    private fun handleSuccessLoadWeatherList(weatherList: List<Weather>) {
        hideLoading()
        viewState.setUpAdapterOrInsertItems(weatherList)
    }

    private fun handleErrorLoadWeatherList(throwable: Throwable) {
        hideLoading()
        showErrorMessage(throwable.localizedMessage)
    }


    private fun showLoading() {
        viewState.showLoading()
    }

    private fun hideLoading() {
        viewState.hideLoading()
    }

    private fun showErrorMessage(errorMessage: String){
        viewState.showErrorMessage(errorMessage)
    }
}