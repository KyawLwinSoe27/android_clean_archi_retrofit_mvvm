package com.example.cryptocurrencyapp.data.remote

import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailsDto
import com.example.cryptocurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CryptoCurrencyApi {
    @GET("coins")
    suspend fun getCoins() : List<CoinDto>

    @GET("coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId : String) : CoinDetailsDto
}