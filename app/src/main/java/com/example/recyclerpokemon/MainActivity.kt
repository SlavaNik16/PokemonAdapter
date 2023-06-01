package com.example.recyclerpokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerpokemon.Adapter.PokemonAdapter
import com.example.recyclerpokemon.Models.Pokemon
import com.example.recyclerpokemon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var pokemonAdapter: PokemonAdapter
    val nameList = listOf(
        "Bulbasaur",
        "Ivysaur",
        "Venasaur",
        "Charmader",
        "Pidgeotto",
        "Pidgeot",
        "Rattata",
        "Raticate",
        "Nidorino",
        "Nidoking",
        "Charmilion",
        "Charizard",
        "Squirtle",
        "Wartortle",
        "Spearow",
        "Fearow",
        "Ekans",
        "Arbok",
        "Clefairy",
        "Clefable",
        "Blastoise",
        "Caterpie",
        "Metapod",
        "Pikachu",
        "Raichu",
        "Sandshrew",
        "Sandslash",
        "Vulpix",
        "Ninetales",
        "Weedle",
        "Kakuna",
        "Beedrill",
        "Pidgey",
        "Nidoran",
        "Nidorina",
        "Nidoqueen",
        "Nidoran",
        "Jigglypuff",
        "Wigglytuff",
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var listPokemon:ArrayList<Pokemon> = arrayListOf()
        var i = 1;

        for(title in nameList) {
            if(i < 10) {
                listPokemon.add(Pokemon(i, "0$i", title))
            }else{
                listPokemon.add(Pokemon(i, "$i", title))
            }
            i++;
        }


        var layoutManager = GridLayoutManager(this@MainActivity,3)

        binding.recyclerView.layoutManager = layoutManager
        pokemonAdapter = PokemonAdapter(this,listPokemon)
        binding.recyclerView.adapter = pokemonAdapter;


    }
}