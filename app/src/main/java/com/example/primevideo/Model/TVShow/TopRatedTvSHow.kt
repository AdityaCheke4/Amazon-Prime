package com.example.primevideo.Model.TVShow


import com.google.gson.annotations.SerializedName

data class TopRatedTvSHow(
    @SerializedName("data")
    val `data`: List<DataTvSHowRated>
)