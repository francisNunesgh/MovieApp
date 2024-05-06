package br.com.movieapp.popularMovie.domain.source

import br.com.movieapp.data.source.response.MovieResponse
import br.com.movieapp.paging.MoviePagingSource

interface PopularMovieDataSource {

    fun getPopularMoviePagingSource(): MoviePagingSource

    suspend fun getPopularMovies(page: Int): MovieResponse
}