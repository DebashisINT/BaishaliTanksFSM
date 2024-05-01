package com.breezefieldsalesbaishalii.features.viewAllOrder.model

import com.breezefieldsalesbaishalii.app.domain.NewOrderColorEntity
import com.breezefieldsalesbaishalii.app.domain.NewOrderGenderEntity
import com.breezefieldsalesbaishalii.app.domain.NewOrderProductEntity
import com.breezefieldsalesbaishalii.app.domain.NewOrderSizeEntity
import com.breezefieldsalesbaishalii.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

