package com.breezefieldsalesbaishalii.features.dailyPlan.model

import com.breezefieldsalesbaishalii.base.BaseResponse
import java.io.Serializable

/**
 * Created by Saikat on 03-01-2020.
 */
class AllPlanListResponseModel : BaseResponse(), Serializable {
    var plan_data: ArrayList<AllPlanListDataModel>? = null
}