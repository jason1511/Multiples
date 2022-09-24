package com.example.multiples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hino =findViewById<ImageView>(R.id.hinoLogo)
        val iveco =findViewById<ImageView>(R.id.mercedesLogo)
        val scania =findViewById<ImageView>(R.id.scaniaLogo)
        val fuso =findViewById<ImageView>(R.id.fusoLogo)

        hino.setOnClickListener{
            val i = Intent(this, DetailActivity::class.java).apply {
                putExtra("picname", Detail("hinopic", "Hino 700 Series JDM", 3.5))
            }
            startActivity(i)
        }
        fuso.setOnClickListener{
            val i = Intent(this, DetailActivity::class.java).apply {
                putExtra("picname", Detail("fusopic", "1999 Fuso Supergreat", 4.0))
            }
            startActivity(i)
        }
        scania.setOnClickListener{
            val i = Intent(this, DetailActivity::class.java).apply {
                putExtra("picname", Detail("scaniapic", "Scania P450 XT", 3.8))
            }
            startActivity(i)
        }
        iveco.setOnClickListener{
            val i = Intent(this, DetailActivity::class.java).apply {
                putExtra("picname", Detail("mercedespic","Mercedes Benz 917",2.3))
            }
            startActivity(i)
        }
    }
}