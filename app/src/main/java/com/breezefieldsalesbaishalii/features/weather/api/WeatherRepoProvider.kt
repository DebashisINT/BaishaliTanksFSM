package com.breezefieldsalesbaishalii.features.weather.api

import com.breezefieldsalesbaishalii.features.task.api.TaskApi
import com.breezefieldsalesbaishalii.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}