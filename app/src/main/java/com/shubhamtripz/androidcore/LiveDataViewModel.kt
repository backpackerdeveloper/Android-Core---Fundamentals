package com.shubhamtripz.androidcore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel: ViewModel() {

    private val factsLiveDataobject = MutableLiveData<String>("This is a fact")
    val factsLiveData : LiveData<String>
        get() = factsLiveDataobject

    fun updateLiveDate(){
        factsLiveDataobject.value = "Another Fact"
    }

}