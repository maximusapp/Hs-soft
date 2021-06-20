package com.example.hssoft.core.di

import android.content.Context
import android.util.Log
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.example.hssoft.BuildConfig
import com.example.hssoft.core.di.qualifire.InterceptorLogTag
import com.example.hssoft.presentation.utils.isLogsEnabled
import com.ihsanbal.logging.Level
import com.ihsanbal.logging.LoggingInterceptor
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import io.reactivex.schedulers.Schedulers
import kotlinx.serialization.UnstableDefault
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class NetworkModule {

    @UnstableDefault
    @Singleton
    @Provides
    internal fun createRetrofit(
        okHttpClient: OkHttpClient,
    ): Retrofit {
        val builder = Retrofit.Builder()
            .baseUrl(BuildConfig.ENDPOINT)
            .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))

        builder.client(okHttpClient)

        return builder.build()
    }

    @Provides
    internal fun okHttpClient(
        logging: LoggingInterceptor,
        chuck: ChuckerInterceptor
    ): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .addInterceptor(logging)
            .addInterceptor(chuck)
            .readTimeout(TIME_OUT, TimeUnit.SECONDS)
            .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
            .writeTimeout(TIME_OUT, TimeUnit.SECONDS)

        return builder.build()
    }

    @Singleton
    @Provides
    @InterceptorLogTag
    internal fun logTag(): String = NETWORK

    @Provides
    internal fun loggingInterceptor(@InterceptorLogTag logTag: String): LoggingInterceptor {
        return LoggingInterceptor.Builder()
            .loggable(isLogsEnabled())
            .setLevel(if (isLogsEnabled()) Level.BASIC else Level.NONE)
            .log(Log.INFO)
            .request(logTag)
            .response(logTag)
            .build()
    }

    @Provides
    internal fun chuckInterceptor(@ApplicationContext context: Context): ChuckerInterceptor =
        ChuckerInterceptor(context)


    companion object {
        private const val TIME_OUT = 30L
        const val NETWORK = "NETWORK"
    }

}