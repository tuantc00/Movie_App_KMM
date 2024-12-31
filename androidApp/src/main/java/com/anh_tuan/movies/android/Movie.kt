package com.anh_tuan.movies.android

import android.app.Application
import com.anh_tuan.movies.android.di.appModule
import com.anh_tuan.movies.di.getSharedModules
import org.koin.core.context.startKoin

class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}