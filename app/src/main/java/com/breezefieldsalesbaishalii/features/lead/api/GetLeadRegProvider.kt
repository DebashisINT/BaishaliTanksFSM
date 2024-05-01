package com.breezefieldsalesbaishalii.features.lead.api

import com.breezefieldsalesbaishalii.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsalesbaishalii.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}