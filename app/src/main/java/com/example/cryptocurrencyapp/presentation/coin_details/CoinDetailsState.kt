package com.example.cryptocurrencyapp.presentation.coin_details

import com.example.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailsState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
