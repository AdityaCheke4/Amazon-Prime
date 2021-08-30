package com.example.primevideo.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.primevideo.Model.ActionMovieListResponse
import com.example.primevideo.Model.ResponseComedyList
import com.example.primevideo.R
import com.example.primevideo.ViewHolder.LatestComedyHolder
import com.example.primevideo.ViewHolder.NewMovieHolder

class NewMovieAdapter(var data1 :List<ActionMovieListResponse> ): RecyclerView.Adapter<NewMovieHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewMovieHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_romance_movie_design, parent, false)
        return NewMovieHolder(view)
    }

    override fun onBindViewHolder(holder: NewMovieHolder, position: Int) {
        val datalist: ActionMovieListResponse = data1[position]
        holder.setData(datalist)
    }

    override fun getItemCount(): Int {
        return data1.size
    }
}