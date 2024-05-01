package com.breezefieldsalesbaishalii.features.photoReg.adapter

import com.breezefieldsalesbaishalii.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}