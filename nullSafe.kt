package com

fun main() {
    //null safety operators
    val name:String? = "steve"
    //safe call ?.
    //return if name is not null else return null
    println("Length of name is ${name?.length}")

    //safe call with let(?.let)
    //it executes the block only if name is not null
    name?.let { println("Length of name is ${it.length}") }

    //elvis operator(?:)
    //when we have nullable reference "name ", we can say "is name is not null",use it
    //otherwise use some non_null value
    val length = name?.length?:-1
    println(length)

    //non_null assertion operator (!!)
    //use it to name if sure that name is not null
    println("The length is ${name!!.length}")

}