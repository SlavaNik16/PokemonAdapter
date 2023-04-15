package com.example.recyclerpokemon.Models

import java.util.jar.Attributes.Name

class Pokemon {

    private var id:Int = 0
    private var img:String = ""
    private var name:String = ""
    private var titleCharacters: MutableList<String> = mutableListOf()
    private var color: MutableList<String> = mutableListOf()

    constructor(
        id: Int,
        img: String,
        name: String,
        titleCharacters: MutableList<String>,
        color: MutableList<String>
    ) {
        this.id = id
        this.img = img
        this.name = name
        this.titleCharacters = titleCharacters
        this.color = color
    }

    constructor(id: Int, img: String, name: String) {
        this.id = id
        this.img = img
        this.name = name
    }

    fun getId():Int = id
    fun getImg():String = img
    fun getName():String = name
    fun getTtitleCharacters():MutableList<String> = titleCharacters
    fun getColor():MutableList<String> = color

}