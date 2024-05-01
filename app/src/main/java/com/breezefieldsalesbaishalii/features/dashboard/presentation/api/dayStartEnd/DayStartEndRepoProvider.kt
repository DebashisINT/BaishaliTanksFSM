package com.breezefieldsalesbaishalii.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalesbaishalii.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsalesbaishalii.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}