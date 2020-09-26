package com

fun main() {
     val program =programu()
    program.reverseAndDisplay("Vinny king") {it.reversed()}
//it is name of one parameter in lambdas

}
 class programu{
    fun reverseAndDisplay (str:String,lambda:(String) ->(String)){
        var result = lambda(str)
        println(result)

    }
}