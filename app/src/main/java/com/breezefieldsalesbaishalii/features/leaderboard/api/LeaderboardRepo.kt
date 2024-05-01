package com.breezefieldsalesbaishalii.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsalesbaishalii.app.FileUtils
import com.breezefieldsalesbaishalii.app.Pref
import com.breezefieldsalesbaishalii.base.BaseResponse
import com.breezefieldsalesbaishalii.features.addshop.model.AddLogReqData
import com.breezefieldsalesbaishalii.features.addshop.model.AddShopRequestData
import com.breezefieldsalesbaishalii.features.addshop.model.AddShopResponse
import com.breezefieldsalesbaishalii.features.addshop.model.LogFileResponse
import com.breezefieldsalesbaishalii.features.addshop.model.UpdateAddrReq
import com.breezefieldsalesbaishalii.features.contacts.CallHisDtls
import com.breezefieldsalesbaishalii.features.contacts.CompanyReqData
import com.breezefieldsalesbaishalii.features.contacts.ContactMasterRes
import com.breezefieldsalesbaishalii.features.contacts.SourceMasterRes
import com.breezefieldsalesbaishalii.features.contacts.StageMasterRes
import com.breezefieldsalesbaishalii.features.contacts.StatusMasterRes
import com.breezefieldsalesbaishalii.features.contacts.TypeMasterRes
import com.breezefieldsalesbaishalii.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalesbaishalii.features.login.model.WhatsappApiData
import com.breezefieldsalesbaishalii.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}