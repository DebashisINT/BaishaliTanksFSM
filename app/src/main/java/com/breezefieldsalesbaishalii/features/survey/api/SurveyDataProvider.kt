package com.breezefieldsalesbaishalii.features.survey.api

import com.breezefieldsalesbaishalii.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsalesbaishalii.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}