package com.shubhamtripz.androidcore

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.shubhamtripz.androidcore.databinding.ActivityDataBindBinding

class DataBindActivity : AppCompatActivity() {

    lateinit var binding: ActivityDataBindBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_bind)

        val quoteObj = Quote(" do or dont try", "shubham ")
       binding.quote = quoteObj

    }
}