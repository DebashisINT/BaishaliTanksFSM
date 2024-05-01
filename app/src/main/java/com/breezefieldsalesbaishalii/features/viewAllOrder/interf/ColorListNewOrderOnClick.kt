package com.breezefieldsalesbaishalii.features.viewAllOrder.interf

import com.breezefieldsalesbaishalii.app.domain.NewOrderColorEntity
import com.breezefieldsalesbaishalii.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}