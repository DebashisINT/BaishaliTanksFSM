package com.breezefieldsalesbaishalii.features.newcollectionreport

import com.breezefieldsalesbaishalii.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}