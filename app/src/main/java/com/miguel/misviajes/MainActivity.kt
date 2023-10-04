package com.miguel.misviajes

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
            recyclerView.adapter = ViajesAdapter(viajes)
            recyclerView.layoutManager = GridLayoutManager(this@MainActivity, 2)
        }
    }


    val viajes = (1 .. 10).map{
        Viaje(
            "https://picsum.photos/200/300?random=$it",
            "Dia $it de mis viajes"
        )
    }
}