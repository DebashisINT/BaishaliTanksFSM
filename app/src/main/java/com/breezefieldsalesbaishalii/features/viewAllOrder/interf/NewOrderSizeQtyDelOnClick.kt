package com.breezefieldsalesbaishalii.features.viewAllOrder.interf

import com.breezefieldsalesbaishalii.app.domain.NewOrderGenderEntity
import com.breezefieldsalesbaishalii.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}