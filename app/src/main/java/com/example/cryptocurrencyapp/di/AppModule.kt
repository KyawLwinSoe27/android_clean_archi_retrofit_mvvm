package com.example.cryptocurrencyapp.di

import com.example.cryptocurrencyapp.common.Constants.BASE_URL
import com.example.cryptocurrencyapp.data.remote.CryptoCurrencyApi
import com.example.cryptocurrencyapp.data.repository.CoilRepositoryImpl
import com.example.cryptocurrencyapp.domain.repository.CoilRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCryptoCurrencyApi(): CryptoCurrencyApi {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CryptoCurrencyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoilRepository(api: CryptoCurrencyApi): CoilRepository {
        return CoilRepositoryImpl(api)
    }
}