package com.example.primevideo.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentResultListener
import com.bumptech.glide.Glide
import com.example.primevideo.R
import kotlinx.android.synthetic.main.fragment_movie_preview.*
import com.example.primevideo.Activity.YoutubeVideoPlayActivity
import org.w3c.dom.Text


class MoviePreviewFragment : Fragment(R.layout.fragment_movie_preview) {

    override
    fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        parentFragmentManager.setFragmentResultListener(
            "Moviename",
            this,
            FragmentResultListener() { s: String, bundle: Bundle ->

                val data = bundle.getString("movieImage")
                Glide.with(ivImagePreviewLayout).load(data).into(ivImagePreviewLayout)
                val moviename = bundle.getString("movieName")
                MovieName.setText(moviename)
                val moviedescription = bundle.getString("moviedescription")
                movieDescriptionPreviewLayout.setText(moviedescription)
                val movietime = bundle.getString("movietime")
                year_mat.setText(movietime)
                val movierating = bundle.getString("movierating")
                rating.text = movierating
                val directorImage = bundle.getString("DirectorImage")
                Glide.with(ivDirectorImage).load(directorImage).into(ivDirectorImage)
                val directorName = bundle.getString("DirectorName")
                tvDirectorName.text = directorName
                val movieUrl = bundle.getString("movieUrl")

                lyt_play.setOnClickListener {
                    val intent = Intent(context, YoutubeVideoPlayActivity::class.java)
                    intent.putExtra("movieUrl", movieUrl)
                    startActivity(intent)
                }
            })

        dramaDataFragment()
        ActionDataFragment()
        RomanceDataFragment()

    }

    private fun RomanceDataFragment() {
        parentFragmentManager.setFragmentResultListener(
            "romancename",
            this,
            FragmentResultListener() { s: String, bundle: Bundle ->

                val data1 = bundle.getString("romanceImage")
                Glide.with(ivImagePreviewLayout).load(data1).into(ivImagePreviewLayout)
                val moviename1 = bundle.getString("romanceName")
                MovieName.setText(moviename1)
                val moviedescription1 = bundle.getString("romancedescription")
                movieDescriptionPreviewLayout.setText(moviedescription1)
                val movietime1 = bundle.getString("romancetime")
                year_mat.setText(movietime1)
                val movierating1 = bundle.getString("romancerating")
                rating.text = movierating1
                val directorImage = bundle.getString("romanceDirectorImage")
                Glide.with(ivDirectorImage).load(directorImage).into(ivDirectorImage)
                val directorName1 = bundle.getString("romanceDirectorName")
                tvDirectorName.text = directorName1
                val movieUrl1 = bundle.getString("romanceUrl")

                lyt_play.setOnClickListener {
                    val intent = Intent(context, YoutubeVideoPlayActivity::class.java)
                    intent.putExtra("romanceUrl", movieUrl1)
                    startActivity(intent)
                }
            })
    }

    private fun ActionDataFragment() {
        parentFragmentManager.setFragmentResultListener(
            "Actionname",
            this,
            FragmentResultListener() { s: String, bundle: Bundle ->

                val data1 = bundle.getString("ActionImage")
                Glide.with(ivImagePreviewLayout).load(data1).into(ivImagePreviewLayout)
                val moviename1 = bundle.getString("ActionName")
                MovieName.setText(moviename1)
                val moviedescription1 = bundle.getString("Actiondescription")
                movieDescriptionPreviewLayout.setText(moviedescription1)
                val movietime1 = bundle.getString("Actiontime")
                year_mat.setText(movietime1)
                val movierating1 = bundle.getString("Actionrating")
                rating.text = movierating1
//                val directorImage = bundle.getString("ActionDirectorImage")
//                Glide.with(ivDirectorImage).load(directorImage).into(ivDirectorImage)
                val directorName1 = bundle.getString("ActionDirectorName")
                tvDirectorName.text = directorName1
                val movieUrl1 = bundle.getString("ActionUrl")

                lyt_play.setOnClickListener {
                    val intent = Intent(context, YoutubeVideoPlayActivity::class.java)
                    intent.putExtra("ActionUrl", movieUrl1)
                    startActivity(intent)
                }
            })
    }

    private fun dramaDataFragment() {
        parentFragmentManager.setFragmentResultListener(
            "Dramaname",
            this,
            FragmentResultListener() { s: String, bundle: Bundle ->

                val data1 = bundle.getString("DramaImage")
                Glide.with(ivImagePreviewLayout).load(data1).into(ivImagePreviewLayout)
                val moviename1 = bundle.getString("DramaName")
                MovieName.setText(moviename1)
                val moviedescription1 = bundle.getString("Dramadescription")
                movieDescriptionPreviewLayout.setText(moviedescription1)
                val movietime1 = bundle.getString("Dramatime")
                year_mat.setText(movietime1)
                val movierating1 = bundle.getString("Dramarating")
                rating.text = movierating1
                val directorImage1 = bundle.getString("DramaDirectorImage")
                Glide.with(ivDirectorImage).load(directorImage1).into(ivDirectorImage)
                val directorName1 = bundle.getString("DramaDirectorName")
                tvDirectorName.text = directorName1
                val movieUrl1 = bundle.getString("DramaUrl")

                lyt_play.setOnClickListener {
                    val intent = Intent(context, YoutubeVideoPlayActivity::class.java)
                    intent.putExtra("DramaUrl", movieUrl1)
                    startActivity(intent)
                }
            })
    }
}