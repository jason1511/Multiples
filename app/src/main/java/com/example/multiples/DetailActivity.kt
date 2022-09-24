package com.example.multiples

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.Switch
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var getpicname =intent.getParcelableExtra<Detail>("picname")

        val detailimg = findViewById<ImageView>(R.id.imageView)
        val imagename = findViewById<TextView>(R.id.textView)
        val ratingpic = findViewById<RatingBar>(R.id.ratingBar)
        ratingpic.numStars = 5

        var starcount = getpicname?.strcount.toString()
        var starnumcount = starcount.toFloat()

        var picname = getpicname?.imgname.toString()
        var imgnm = getpicname?.imgtag.toString()


        if (picname == "hinopic"){
            detailimg.setImageResource(R.drawable.hinopic)
            imagename.setText(imgnm)
            ratingpic.rating = starnumcount
        }
        if (picname=="fusopic"){
            detailimg.setImageResource(R.drawable.fusopic)
            imagename.setText(imgnm)
            ratingpic.rating = starnumcount
        }
        if (picname=="scaniapic"){
            detailimg.setImageResource(R.drawable.scaniapic)
            imagename.setText(imgnm)
            ratingpic.rating = starnumcount
        }
        if (picname=="mercedespic"){
            detailimg.setImageResource(R.drawable.mercedespic)
            imagename.setText(imgnm)
            ratingpic.rating = starnumcount
        }
    }
}