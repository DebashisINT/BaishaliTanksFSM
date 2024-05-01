package com.breezefieldsalesbaishalii.features.viewAllOrder.interf

import com.breezefieldsalesbaishalii.app.domain.NewOrderProductEntity
import com.breezefieldsalesbaishalii.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}