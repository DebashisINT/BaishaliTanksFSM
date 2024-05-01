package com.breezefieldsalesbaishalii.features.nearbyuserlist.api

import com.breezefieldsalesbaishalii.app.Pref
import com.breezefieldsalesbaishalii.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsalesbaishalii.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsalesbaishalii.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}