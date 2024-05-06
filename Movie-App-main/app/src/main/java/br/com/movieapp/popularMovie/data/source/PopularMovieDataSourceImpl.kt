package br.com.movieapp.popularMovie.data.source

import br.com.movieapp.data.source.response.MovieResponse
import br.com.movieapp.data.source.service.MovieService
import br.com.movieapp.paging.MoviePagingSource
import br.com.movieapp.popularMovie.domain.source.PopularMovieDataSource

class PopularMovieDataSourceImpl(
    private val movieService: MovieService
): PopularMovieDataSource {
    override fun getPopularMoviePagingSource(): MoviePagingSource {
        return MoviePagingSource(this)
    }

    override suspend fun getPopularMovies(page: Int): MovieResponse {
        return movieService.getPopularMovies(page = page)
    }
}