package com.breezefieldsalesbaishalii.features.marketing.api.marketingcategorylist

import com.breezefieldsalesbaishalii.features.marketing.model.MarketingCategoryListResponse
import io.reactivex.Observable

/**
 * Created by Pratishruti on 28-02-2018.
 */
class MarketingCategoryListRepo(val apiService: MarketingCategoryListApi) {
    fun getMarketingCategoryList(): Observable<MarketingCategoryListResponse> {
        return apiService.getMarketingCategoryList()
    }
}