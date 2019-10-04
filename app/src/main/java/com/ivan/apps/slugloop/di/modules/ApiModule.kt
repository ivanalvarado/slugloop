package com.ivan.apps.slugloop.di.modules

import com.ivan.apps.slugloop.network.BusService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ApiModule {
    @Provides
    @Singleton
    fun provideBusServie(retrofit: Retrofit): BusService {
        return retrofit.create(BusService::class.java)
    }
}