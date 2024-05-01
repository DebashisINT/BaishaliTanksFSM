package com.breezefieldsalesbaishalii.features.weather.api

import com.breezefieldsalesbaishalii.base.BaseResponse
import com.breezefieldsalesbaishalii.features.task.api.TaskApi
import com.breezefieldsalesbaishalii.features.task.model.AddTaskInputModel
import com.breezefieldsalesbaishalii.features.weather.model.ForeCastAPIResponse
import com.breezefieldsalesbaishalii.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}