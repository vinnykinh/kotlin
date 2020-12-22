package com
val pi:Float? by lazy { 3.14f }  //waste of memory //can be var or val
fun main() {
    println("Some code")
    println("hello ")
    val area1 =pi!! * 4 * 4 //saved in cache memory
    println(area1)

}