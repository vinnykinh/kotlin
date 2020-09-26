package com

import java.util.*
import java.util.Collections.reverse

fun main() {

    var myArray = Array<Int>(5) { 0 }
    myArray[0] = 67
    myArray[1] =11

  //  println(myArray[3]);
    for (i in myArray)
    {
        println(i)
    }
    println()
    for (index in 0..myArray.size -1)
    {
        println(myArray[index])
    }

    val list = listOf<String>("manana","apples","cabbage") //immutable can only be read only
    reverse(list)
     for (element in list){
         println(element)
     }

    println()
    val list1: MutableList<String> = mutableListOf<String>()
    list1.add("cabbage")
    list1.add("cabbage")
    list1[1] ="Bananas"
    //immutable can only be read only
    for (element in list1){
        println(element)
    }



//mutable has fixed size
//immutable colloections -> read only -> listof,mapof,setof
//mutableCollections ->read and write -> arraylistof ,mutablelistof ,hashmap,hashmapof ,mutablesetof,hashsetof
}