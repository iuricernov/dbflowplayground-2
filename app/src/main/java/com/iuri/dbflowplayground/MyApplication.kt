package com.iuri.dbflowplayground

import android.app.Application
import android.util.Log
import com.dbflow5.config.DatabaseConfig
import com.dbflow5.config.FlowConfig
import com.dbflow5.config.FlowLog
import com.dbflow5.config.FlowManager
import com.dbflow5.database.AndroidSQLiteOpenHelper
import com.iuri.dbflowplayground.database.MyDatabase

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        FlowManager.init(
            FlowConfig.Builder(this)
                .database(
                    DatabaseConfig.builder(MyDatabase::class, AndroidSQLiteOpenHelper.createHelperCreator(this))
                        .databaseName("MyDatabase")
                        .build()
                )
                .build()
        )
        FlowLog.setMinimumLoggingLevel(FlowLog.Level.V)
        Log.d("DB", "DBFlow initialized")
    }
}
