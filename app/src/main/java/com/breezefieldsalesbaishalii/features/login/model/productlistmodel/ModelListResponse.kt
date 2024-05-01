package com.breezefieldsalesbaishalii.features.login.model.productlistmodel

import com.breezefieldsalesbaishalii.app.domain.ModelEntity
import com.breezefieldsalesbaishalii.app.domain.ProductListEntity
import com.breezefieldsalesbaishalii.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}