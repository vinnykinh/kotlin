package com

fun main() {
    val me =Me()
    with(me){//can only call properties
        name ="Vinny"
        age =21
    }

    me.apply { //apply can call methods and properties
        name ="karimi"
        age =22
    }.wake()

}
class Me{
    var name:String =""
    var age:Int =21
    fun wake(){
        println("Wake up")
    }
}