package com.example.hssoft.presentation.utils

import com.orhanobut.logger.BuildConfig

fun isLogsEnabled() = !isMarketReleaseBuild()
fun isMarketReleaseBuild() = BuildConfig.FLAVOR == "market_" && !BuildConfig.DEBUG