package com.anh_tuan.movies.android.di

import com.anh_tuan.movies.android.detail.DetailViewModel
import com.anh_tuan.movies.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get()) }
}