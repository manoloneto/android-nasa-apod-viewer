package br.com.manoloneto.napod.data.network

import br.com.manoloneto.napod.BuildConfig
import br.com.manoloneto.napod.data.model.NasaItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("planetary/apod")
    suspend fun getNasaItem(
        @Query("api_key") apiKey: String = BuildConfig.NASA_API_KEY,
    ): Response<NasaItem>
}
