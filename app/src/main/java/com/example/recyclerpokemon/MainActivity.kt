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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var listPokemon:ArrayList<Pokemon> = arrayListOf()
        listPokemon.add(Pokemon(1,"ic_launcher_background","Bulbasaur"))
        listPokemon.add(Pokemon(2,"ic_launcher_foreground","Ivysaur"))
        listPokemon.add(Pokemon(3,"ic_adb","Venusaur"))
        listPokemon.add(Pokemon(4,"ic_launcher_foreground","Charmander"))
        listPokemon.add(Pokemon(5,"ic_launcher_foreground","Ivysaur"))
        listPokemon.add(Pokemon(6,"ic_launcher_foreground","Charmander"))
        listPokemon.add(Pokemon(7,"ic_launcher_foreground","Ivysaur"))
        listPokemon.add(Pokemon(8,"ic_launcher_background","Venusaur"))
        listPokemon.add(Pokemon(9,"ic_launcher_foreground","Charmander"))

        var layoutManager = GridLayoutManager(this@MainActivity,3)

        binding.recyclerView.layoutManager = layoutManager
        pokemonAdapter = PokemonAdapter(this,listPokemon)
        binding.recyclerView.adapter = pokemonAdapter;


    }
}