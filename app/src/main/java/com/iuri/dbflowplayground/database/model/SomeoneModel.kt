package com.iuri.dbflowplayground.database.model

import com.dbflow5.annotation.Column
import com.dbflow5.annotation.PrimaryKey
import com.dbflow5.annotation.Table
import com.dbflow5.structure.BaseModel
import com.iuri.dbflowplayground.database.MyDatabase

@Table(database = MyDatabase::class)
data class SomeoneModel(
    @Column
    @PrimaryKey(autoincrement = true)
    var id: Long = 0L,

    @Column
    var name: String = "",

    @Column
    var surname: String = "",

    @Column
    var isMale: Boolean = true

) : BaseModel()
