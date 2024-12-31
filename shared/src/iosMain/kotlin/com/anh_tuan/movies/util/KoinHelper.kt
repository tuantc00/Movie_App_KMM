package com.anh_tuan.movies.util

import com.anh_tuan.movies.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}