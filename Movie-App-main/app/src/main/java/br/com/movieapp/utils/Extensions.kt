package br.com.movieapp.utils

private const val TMDB_BASE_URL_IMAGE = "https://image.tmdb.org/t/p/w1280"

fun String?.toPostUrl() = "${TMDB_BASE_URL_IMAGE}$this"

fun String?.toBackdropUrl() = "${TMDB_BASE_URL_IMAGE}$this"