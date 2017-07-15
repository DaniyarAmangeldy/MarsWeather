package com.marsttudio.marsweather.presentation.weather.views

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.marsttudio.marsweather.R
import com.marsttudio.marsweather.Utils.getMonthName
import com.marsttudio.marsweather.data.models.Weather
import kotlinx.android.synthetic.main.layout_item_weather.view.*
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by daniyaramangeldy on 15.07.17.
 */
class WeatherAdapter: RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>() {
    lateinit private var  weatherList: List<Weather>


    override fun onBindViewHolder(holder: WeatherViewHolder?, position: Int) {
        val weather = weatherList[position]
        holder?.bind(weather)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): WeatherViewHolder {
        val weatherView: View = LayoutInflater.from(parent?.context).inflate(R.layout.layout_item_weather,parent,false)
        return WeatherViewHolder(weatherView)
    }

    override fun getItemCount(): Int = weatherList.size


    fun setWeatherList(weatherList: List<Weather>){
           this.weatherList = weatherList
    }

    inner class WeatherViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var tvEarthDate: TextView
        lateinit var tvSol: TextView
        lateinit var tvPressure: TextView
        lateinit var tvMinTemp: TextView
        lateinit var tvMaxTemp: TextView


        init {
            itemView.let{
                this.tvSol = it.sol
                this.tvEarthDate = it.earthDate
                this.tvPressure = it.pressure
                this.tvMinTemp = it.minTemp
                this.tvMaxTemp = it.maxTemp
            }

        }

        fun bind(weather: Weather){
            weather.let {
                val context: Context = itemView.context
                val calendar = Calendar.getInstance()
                val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.US)
                calendar.time = sdf.parse(it.earthDay)
                val formattedDateText = "${calendar.get(Calendar.MONTH).getMonthName(context)} ${calendar.get(Calendar.DAY_OF_MONTH)}, ${calendar.get(Calendar.YEAR)}"
                tvSol.text = context.getString(R.string.info_weahter_sol_number,it.sol)
                tvMaxTemp.text = context.getString(R.string.info_weather_max_temp,it.maxTemp)
                tvMinTemp.text = context.getString(R.string.info_weather_min_temp,it.minTemp)
                tvMinTemp.text = context.getString(R.string.info_weather_min_temp,it.minTemp)
                tvEarthDate.text = context.getString(R.string.info_weather_earth_date,formattedDateText)
                tvPressure.text = context.getString(R.string.info_weather_pressure, it.pressure.toInt())
            }
        }
    }
}