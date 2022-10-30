package com.interviewprep.kotlinviewbinding.network

import okhttp3.OkHttpClient
import okhttp3.OkHttpClient.Builder
import java.util.concurrent.TimeUnit.SECONDS

class OkHttpProvider {
    val client: OkHttpClient
        get() {
            val okBuilder: Builder = Builder()
                .writeTimeout(WRITE_TIMEOUT.toLong(), SECONDS)
                .readTimeout(READ_TIMEOUT.toLong(), SECONDS)
                .connectTimeout(CONNECT_TIMEOUT.toLong(), SECONDS)
            return okBuilder.build()
        }

    companion object {
        private const val WRITE_TIMEOUT = 60
        private const val READ_TIMEOUT = 180
        private const val CONNECT_TIMEOUT = 90
    }
}
