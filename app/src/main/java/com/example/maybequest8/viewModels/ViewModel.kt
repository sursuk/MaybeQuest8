package com.example.maybequest8.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.maybequest8.database.Place

class ViewModel : ViewModel() {


    private var _questionText = MutableLiveData<String>().apply {
        value = "This is home Fragment sdfghjkl;"
    }
    val text: LiveData<String> = _questionText

    private var _city = MutableLiveData<String>().apply {
    }
    var city: LiveData<String> = _city

    private var _route = MutableLiveData<Array<Place>>().apply {  }
    val route: LiveData<Array<Place>> = _route

    private var _score = MutableLiveData<Int>().apply {  }
    val score: LiveData<Int> = _score





    fun setCity(city: String){
        _city.value = city
    }
}

