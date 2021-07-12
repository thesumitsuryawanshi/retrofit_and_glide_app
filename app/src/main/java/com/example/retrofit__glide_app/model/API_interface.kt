package com.example.retrofit__glide_app.model

import retrofit2.Call
import retrofit2.http.GET

interface API_interface
{

    @GET("posts")
    fun getdata():Call<List<mydata_items>>

}