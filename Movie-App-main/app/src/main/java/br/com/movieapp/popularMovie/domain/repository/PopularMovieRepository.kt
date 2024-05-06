package br.com.movieapp.popularMovie.domain.repository

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.movieapp.domain.Movie
import java.util.concurrent.Flow

interface PopularMovieRepository {

    fun getPopularMovies(pagingConfig: PagingConfig): Flow<PagingData<Movie>>
}