package com.marsttudio.marsweather.data.repository.weather

import com.marsttudio.marsweather.data.network.WeatherApi
import com.marsttudio.marsweather.di.weather.WeatherScope
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by marsstudio on 14.07.17.
 */

@WeatherScope
class WeatherRepositoryImpl @Inject constructor(val weatherApi: WeatherApi): WeatherRepository {



    override fun loadRepositoriesFromApi(page: Int) = weatherApi.getWeatherArchive(page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())

}