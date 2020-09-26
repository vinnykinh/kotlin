package com

fun main() {
    var name:String ="dummy"
    val country =Country()
    country.setup()

}
class Country{
    //lateinit can only be var
    //used only with non_null data type
    //must be initialised before you use it
    lateinit var name:String
    fun setup(){
        name ="Kenya"
        println("The name is country is ${name}")
    }

}