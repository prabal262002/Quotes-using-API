package com.example.apidata

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("quotes")
    fun gitProductBeta(): Call<DataClass>
}