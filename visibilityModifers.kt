package com

fun main() {

}
//internal inside module
//pri
class Testclass{
    fun testing(){
        //person.a and person.b are not visible becoz they are private and protected
        //person.c and person.d are visible becoz they are public and internal
        var person =Person()
    }
}
open class Person {
    private val a = 0
    protected val b = 9
    internal val c = 8
     val d = 2
    //protected can be visible in sub classes but no other class
}

class Kenyan : Person() { //derived/child class
    //a not visible
    //b and c and d are visisble
    fun test(){
        print(d)
        print(c)
        print(b)
        //print(a)
    }

}

