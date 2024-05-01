package com.breezefieldsalesbaishalii.features.viewAllOrder.orderOptimized

import com.breezefieldsalesbaishalii.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsalesbaishalii.base.BaseResponse
import com.breezefieldsalesbaishalii.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}