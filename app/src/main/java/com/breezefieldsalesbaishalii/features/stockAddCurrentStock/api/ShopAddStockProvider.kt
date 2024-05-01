package com.breezefieldsalesbaishalii.features.stockAddCurrentStock.api

import com.breezefieldsalesbaishalii.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesbaishalii.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}