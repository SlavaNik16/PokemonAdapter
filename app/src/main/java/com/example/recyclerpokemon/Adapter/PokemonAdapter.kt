package com.example.recyclerpokemon.Adapter

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerpokemon.Models.Pokemon
import com.example.recyclerpokemon.R

class PokemonAdapter() : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    lateinit var context:Context
    lateinit var pokemonList: ArrayList<Pokemon>

    constructor(context: Context, pokemonList: ArrayList<Pokemon>):this(){
        this.context = context
        this.pokemonList = pokemonList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        var pokeminItem:View = LayoutInflater.from(context).inflate(R.layout.pokemon_item, parent,false)
        return PokemonViewHolder(pokeminItem)
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.txtId.text = pokemonList.get(position).getId().toString()
        var imageId:Int =  context.resources.getIdentifier("pok_0"+pokemonList.get(position).getImg(),"drawable",context.packageName)
        holder.txtImg.setImageResource(imageId)
        holder.txtTitle.text = pokemonList.get(position).getName()
    }

    class PokemonViewHolder : RecyclerView.ViewHolder {
        lateinit var txtTitle:TextView
        lateinit var txtImg: ImageView
        lateinit var txtId: TextView
        constructor(itemView: View) : super(itemView){
            txtId = itemView.findViewById(R.id.txtId)
            txtTitle = itemView.findViewById(R.id.txtTitle)
            txtImg = itemView.findViewById(R.id.txtImg)
        }
    }

}
