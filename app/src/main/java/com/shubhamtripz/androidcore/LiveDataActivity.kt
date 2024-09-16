package com.shubhamtripz.androidcore

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LiveDataActivity : AppCompatActivity() {

    lateinit var liveDataViewModel: LiveDataViewModel
    private val factTextView : TextView
        get() = findViewById(R.id.factsTextView)

    private val btnUpdate : Button
        get() = findViewById(R.id.btnUpdate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        liveDataViewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)

        liveDataViewModel.factsLiveData.observe(this, Observer{
        factTextView.text = it
        })

        btnUpdate.setOnClickListener {
            liveDataViewModel.updateLiveDate()
        }

    }
}