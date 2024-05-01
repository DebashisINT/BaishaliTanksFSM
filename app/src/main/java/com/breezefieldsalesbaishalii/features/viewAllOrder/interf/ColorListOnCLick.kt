package com.breezefieldsalesbaishalii.features.viewAllOrder.interf

import com.breezefieldsalesbaishalii.app.domain.NewOrderGenderEntity
import com.breezefieldsalesbaishalii.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}