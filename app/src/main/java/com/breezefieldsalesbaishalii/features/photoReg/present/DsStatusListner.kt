package com.breezefieldsalesbaishalii.features.photoReg.present

import com.breezefieldsalesbaishalii.app.domain.ProspectEntity
import com.breezefieldsalesbaishalii.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}