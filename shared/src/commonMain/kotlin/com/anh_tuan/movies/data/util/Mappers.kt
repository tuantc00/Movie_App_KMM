package com.anh_tuan.movies.data.util

import com.anh_tuan.movies.data.remote.MovieRemote
import com.anh_tuan.movies.domain.model.Movie

internal fun MovieRemote.toMovie(): Movie{
    return Movie(
        id = id,
        title = title,
        description = overview,
        imageUrl = getImageUrl(posterImage),
        releaseDate = releaseDate
    )
}

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w500/$posterImage"