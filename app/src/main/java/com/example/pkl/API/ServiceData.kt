package com.example.pkl.API

import com.example.pkl.Model.Ngopi


class ServiceData {
    private val BASE_URL = "https://jsonplaceholder.typicode.com/"
    private val api: data

    init {
        api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(data::class.java)
    }

    fun getPhotos(): Single<List<ngopi>> {
        return api.getPhotos()
    }
}