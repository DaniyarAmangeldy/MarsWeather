package com.marsttudio.marsweather.presentation.weather.views


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.marsttudio.marsweather.Application.App
import com.marsttudio.marsweather.R
import com.marsttudio.marsweather.data.Weather
import com.marsttudio.marsweather.domain.weatherInteractor.WeatherInteractor
import com.marsttudio.marsweather.presentation.weather.presenters.WeatherPresenter
import kotlinx.android.synthetic.main.fragment_weather.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.support.v4.toast
import javax.inject.Inject


class WeatherFragment : MvpAppCompatFragment(), WeatherView, AnkoLogger {

    @InjectPresenter(type = PresenterType.GLOBAL)
    lateinit var weatherPresenter: WeatherPresenter



    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideDialogPresenter() = WeatherPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater!!.inflate(R.layout.fragment_weather, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        weatherPresenter.loadWeatherList()
    }

    companion object {
        fun newInstance(): WeatherFragment {
            val fragment = WeatherFragment()
            return fragment
        }
    }

    override fun hideLoading() {
        progressBar.visibility = View.GONE
    }

    override fun setUpAdapterOrInsertItems(weatherList: List<Weather>) {
        toast(weatherList.get(0).pressure.toString())
    }

    override fun showErrorMessage(error: String) {
        toast(error)
    }

    override fun showLoading() {
        progressBar.visibility = View.VISIBLE
    }

}
