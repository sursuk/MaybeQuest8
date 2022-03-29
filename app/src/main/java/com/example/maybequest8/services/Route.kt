package com.example.maybequest8.services

import android.app.Service
import android.content.Intent
import android.os.IBinder

class Route : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        var quantityCities: Int = intent!!.getIntExtra("quantityCities", 0)
        //TODO сделать алгоритм создания маршрута
            //TODO сохранить маршрут в хранилище локальное
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
    }


}