package com

fun main() {
    //all,any,count,find
    val myNo = listOf<Int>(1,2,3,4,5,6,6,67)
   // val a = myNo.all { num ->num<100 }
    val b = myNo.any { it<10 }
    val c = myNo.count { it>10 }
    val d = myNo.find { it>10 }
    val myPredicate ={num:Int -> num>10}
    val a = myNo.find(myPredicate)
    println(a)
    println(b)
    println(c)
    println(d)

}