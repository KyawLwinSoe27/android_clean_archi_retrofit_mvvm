package com.example.cryptocurrencyapp.data.repository

import com.example.cryptocurrencyapp.data.remote.CryptoCurrencyApi
import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailsDto
import com.example.cryptocurrencyapp.data.remote.dto.CoinDto
import com.example.cryptocurrencyapp.domain.repository.CoilRepository
import javax.inject.Inject

class CoilRepositoryImpl @Inject constructor(
    private val api: CryptoCurrencyApi
) : CoilRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailsDto {
        return api.getCoinById(coinId)
    }

}