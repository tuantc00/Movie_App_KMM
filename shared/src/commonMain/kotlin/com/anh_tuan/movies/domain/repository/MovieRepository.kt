package com.anh_tuan.movies.domain.repository

import com.anh_tuan.movies.domain.model.Movie

internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}