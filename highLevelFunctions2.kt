package com

fun main() {
    val add = Add()
    var result  = 0
    //can modify outside variable in kotlin lambdas
     //var lambda:(Int,Int)->Int  = {x:Int,y:Int ->x+y }
    //add.addition(10, 20, { x, y -> x + y })
    add.addition(10, 20) { x, y -> result = x + y }
    println(result)

}

class Add {
    fun addition(a: Int, b: Int, lambda: (Int, Int) -> Unit) {
        lambda(a,b)
        //val result = lambda(a, b) //a+b =x+y =20+10 =result
        //println(result)

    }
}