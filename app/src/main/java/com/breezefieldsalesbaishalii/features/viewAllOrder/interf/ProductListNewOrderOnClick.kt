package com.breezefieldsalesbaishalii.features.viewAllOrder.interf

import com.breezefieldsalesbaishalii.app.domain.NewOrderGenderEntity
import com.breezefieldsalesbaishalii.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}