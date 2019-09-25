package com.ivan.apps.slugloop.repository

import com.ivan.apps.slugloop.network.Bus
import com.ivan.apps.slugloop.network.BusService
import io.reactivex.Observable
import javax.inject.Inject

interface BusRepository {
    fun getBuses(): Observable<Bus>
}

class BusRepositoryImpl @Inject constructor(private val busService: BusService) : BusRepository {
    override fun getBuses(): Observable<Bus> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}