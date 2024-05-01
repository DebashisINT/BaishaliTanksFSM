package com.breezefieldsalesbaishalii.features.location.api

import com.breezefieldsalesbaishalii.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesbaishalii.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}