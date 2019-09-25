package com.ivan.apps.slugloop.network

import io.reactivex.Observable
import retrofit2.http.GET

interface BusService {
    @GET("/get")
    fun getBuses(): Observable<Bus>
}

data class Bus(
    val id: String,
    val lat: Double,
    val lon: Double,
    val type: String
)