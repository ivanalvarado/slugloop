package com.ivan.apps.slugloop.repository

import com.ivan.apps.slugloop.network.Bus
import io.reactivex.Observable

interface BusRepository {
    fun getBuses(): Observable<Bus>
}

class BusRepositoryImpl : BusRepository {
    override fun getBuses(): Observable<Bus> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}