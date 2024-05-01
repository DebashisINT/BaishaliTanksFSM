package com.breezefieldsalesbaishalii.features.activities.api

import com.breezefieldsalesbaishalii.features.member.api.TeamApi
import com.breezefieldsalesbaishalii.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}