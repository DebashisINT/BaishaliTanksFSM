package com.breezefieldsalesbaishalii.features.document.api

import com.breezefieldsalesbaishalii.features.dymanicSection.api.DynamicApi
import com.breezefieldsalesbaishalii.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}