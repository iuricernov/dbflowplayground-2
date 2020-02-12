package com.iuri.dbflowplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            startActivityForResult(Intent(this, AddSomeoneActivity::class.java), 99)
        }

        // TODO fill with correct data
        recycler_view.adapter = ListAdapter(
            listOf(
                ListAdapterItem("First teacher"),
                ListAdapterItem("Sec teacher"),
                ListAdapterItem("Third teacher"),
                ListAdapterItem("Other teacher"),
                ListAdapterItem("Other teacher"),
                ListAdapterItem("Other teacher"),
                ListAdapterItem("Other teacher"),
                ListAdapterItem("Other teacher")
            )
        )
    }
}
