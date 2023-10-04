package com.miguel.misviajes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.miguel.misviajes.databinding.ViewViajesBinding
import com.miguel.misviajes.model.Viaje

class ViajesAdapter(val viajes: List<Viaje>): RecyclerView.Adapter<ViajesAdapter.ViewHolder>(){
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val binding = ViewViajesBinding.bind(view)

        fun bind(viaje: Viaje){
            with(binding){
                Glide.with(root.context).load(viaje.urlImage).into(imagen)
                texto.text = viaje.texto
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_viajes, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return viajes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(viajes[position])
    }

}