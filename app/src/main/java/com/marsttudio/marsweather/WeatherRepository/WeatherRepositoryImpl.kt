package com.marsttudio.marsweather.WeatherRepository

import com.marsttudio.marsweather.data.network.WeatherApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by marsstudio on 14.07.17.
 */

@Singleton
class WeatherRepositoryImpl @Inject constructor(val weatherApi: WeatherApi): WeatherRepository {



    override fun loadRepositoriesFromApi(page: Int) = weatherApi.getWeatherArchive(page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())

}