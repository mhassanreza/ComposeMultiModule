package com.bigint.authentication.screens

import android.util.Log
import androidx.lifecycle.ViewModel

class SampleViewModel: ViewModel() {
    var valueOfSharedVM = 1000;

    init {
        Log.d("SampleViewModel", "SampleViewModel instance created!")
    }
}