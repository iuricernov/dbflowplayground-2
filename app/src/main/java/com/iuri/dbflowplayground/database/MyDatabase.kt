package com.iuri.dbflowplayground.database

import com.dbflow5.annotation.Database
import com.dbflow5.config.DBFlowDatabase

@Database(version = MyDatabase.VERSION)
abstract class MyDatabase : DBFlowDatabase() {
    companion object {
        const val VERSION = 1
    }
}
