package br.com.movieapp.popularMovie.data.mapper

import br.com.movieapp.data.source.model.MovieResult
import br.com.movieapp.domain.Movie
import br.com.movieapp.utils.toPostUrl

fun List<MovieResult>.toMovie() = map { movieResult ->
    Movie(
        id = movieResult.id,
        title = movieResult.title,
        voteAverage = movieResult.voteAverage,
        imageUrl = movieResult.posterPath?.toPostUrl() ?: ""
    )
}