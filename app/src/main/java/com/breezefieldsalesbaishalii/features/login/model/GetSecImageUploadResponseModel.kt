package com.breezefieldsalesbaishalii.features.login.model

import com.breezefieldsalesbaishalii.app.domain.AddShopSecondaryImgEntity


class GetSecImageUploadResponseModel {
    var status:String? = null
    var message:String? = null
    var lead_shop_list: ArrayList<AddShopSecondaryImgEntity>? = null
}