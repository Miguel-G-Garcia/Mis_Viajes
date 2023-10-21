package com.miguel.misviajes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.miguel.misviajes.databinding.ActivityMainBinding
import com.miguel.misviajes.model.Viaje

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            recyclerView.adapter = ViajesAdapter(viajes) {coordenada ->

                val coordenadas = "${coordenada.latitud},${coordenada.longitud}"
                val uri = "geo:$coordenadas?q=${Uri.encode(coordenada.texto)}"
                val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
                startActivity(mapIntent)
            }
        }
    }


    val viajes = (1 .. 100).map{
        Viaje(
            "https://loremflickr.com/240/320/travel?lock=1$it",
            "Viaje $it",
            "40.4165000", "-3.7025600"
        )
    }
}