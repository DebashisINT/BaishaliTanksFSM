package com.breezefieldsalesbaishalii.features.location.shopRevisitStatus

import com.breezefieldsalesbaishalii.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesbaishalii.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}