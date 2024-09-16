package com.shubhamtripz.androidcore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.Date

class RoomDBActivity : AppCompatActivity() {

    lateinit var database: ContactDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_dbactivity)

        database =  ContactDatabase.getDatabase(this)
        val database2 = ContactDatabase.getDatabase(this)

//        database = Room.databaseBuilder(applicationContext,
//        ContactDatabase::class.java,
//            "contactDB").build()

        GlobalScope.launch {
            database.contactDao().insertContact(Contact(0,"jhon", "99999", Date()))
        }

    }
}