package com.wpi.cs4518.macroMicromanager

import androidx.annotation.StringRes

data class Question(
    @StringRes val textResId: Int,
    var answer: Boolean,
    val continent: String
)