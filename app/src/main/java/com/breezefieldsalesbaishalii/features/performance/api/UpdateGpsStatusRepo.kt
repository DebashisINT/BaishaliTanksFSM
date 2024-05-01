package com.breezefieldsalesbaishalii.features.performance.api

import com.breezefieldsalesbaishalii.base.BaseResponse
import com.breezefieldsalesbaishalii.features.performance.model.UpdateGpsInputListParamsModel
import com.breezefieldsalesbaishalii.features.performance.model.UpdateGpsInputParamsModel
import io.reactivex.Observable

/**
 * Created by Saikat on 15-11-2018.
 */
class UpdateGpsStatusRepo(val apiService: UpdateGpsStatusApi) {
    fun updateGpsStatus(updateGps: UpdateGpsInputParamsModel): Observable<BaseResponse> {
        return apiService.updateGpsStatus(updateGps)
    }
    fun updateGpsStatuswithList(updateGpslist: UpdateGpsInputListParamsModel): Observable<BaseResponse> {
        return apiService.updateGpsStatusWithList(updateGpslist)
    }
}