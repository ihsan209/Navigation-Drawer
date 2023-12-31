package com.ihsannuraripin.navigationdrawer.data.retrofit

import com.ihsannuraripin.navigationdrawer.data.response.RestaurantResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/detail/{id}")
    fun getRestaurant(
        @Path("id") id : String
    ): Call<RestaurantResponse>
}