package br.com.movieapp.data.source.service

import br.com.movieapp.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

const val API_KEY_PARAMS = "e36106c08fc27b453f5f030dca536b75"
const val LANGUAGE_PARAM = "language"
const val LANGUAGE_VALUE = "pt-br"
private const val API_BASE_URL = "https://api.themoviedb.org/3/"

class ParamsInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
       val request = chain.request()
        val url = request.url.newBuilder()
            .addQueryParameter(LANGUAGE_PARAM, LANGUAGE_VALUE)
            .addQueryParameter(API_KEY_PARAMS, "e36106c08fc27b453f5f030dca536b75")
            .build()

        val newRequest = request.newBuilder()
            .url(url)
            .build()

        return chain.proceed(newRequest)
    }
}