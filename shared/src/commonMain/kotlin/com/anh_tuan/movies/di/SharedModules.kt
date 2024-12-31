package com.anh_tuan.movies.di

import com.anh_tuan.movies.data.remote.MovieService
import com.anh_tuan.movies.data.remote.RemoteDataSource
import com.anh_tuan.movies.data.repository.MovieRepositoryImpl
import com.anh_tuan.movies.domain.repository.MovieRepository
import com.anh_tuan.movies.domain.usecase.GetMovieUseCase
import com.anh_tuan.movies.domain.usecase.GetMoviesUseCase
import com.anh_tuan.movies.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules












