package com.practice

fun main() {
    val lambda :(String,String) ->(String) = {x:String,y:String -> x+y}
    val name:String = "Vincent Karimi"
    method("Gichimu Vincent","Othaya HomeTown",lambda)

    val modulusLambda:(Int,Int) ->(Int) ={x:Int,y:Int ->x/y}
    modulusFx(10,1000,modulusLambda)

}
fun method(name:String,name2:String, lambda:(String,String) ->(String)){
    val x = lambda(name,name2)
    println(x)

}
fun modulusFx(a:Int,b:Int,modulus:(Int,Int) ->(Int)){
    val result = modulus(a,b)
    println(result)
}