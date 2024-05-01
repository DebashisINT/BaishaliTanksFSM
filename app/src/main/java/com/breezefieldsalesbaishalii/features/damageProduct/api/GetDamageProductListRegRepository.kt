package com.breezefieldsalesbaishalii.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldsalesbaishalii.app.FileUtils
import com.breezefieldsalesbaishalii.base.BaseResponse
import com.breezefieldsalesbaishalii.features.NewQuotation.model.*
import com.breezefieldsalesbaishalii.features.addshop.model.AddShopRequestData
import com.breezefieldsalesbaishalii.features.addshop.model.AddShopResponse
import com.breezefieldsalesbaishalii.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldsalesbaishalii.features.damageProduct.model.delBreakageReq
import com.breezefieldsalesbaishalii.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldsalesbaishalii.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldsalesbaishalii.features.myjobs.model.WIPImageSubmit
import com.breezefieldsalesbaishalii.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}