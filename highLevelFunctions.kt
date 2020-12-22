package com



fun main() {
  val program =Program()
    program.add(23,10,object :myInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })
   // var test:String ="Hello"
    val mylambda:(Int) -> Unit   = { S:Int -> println(S)} //function //lambda expression
    program.add(2,7 , mylambda )//high level function accepts lambda function as a parameter

}
//lambdas functions with no name
class Program{

    fun add(a:Int,b:Int, action: myInterface){ //object oriented way
        val sum =a+b
        action.execute(sum)

    }
    fun add(a:Int,b:Int,action: (Int) -> Unit){ //high level way
        val sum =a+b
        action(sum) //println(sum)
    }
    fun add(a:Int ,b:Int){    //simple way
        val sum = a+b
        println(sum)
    }

}
interface myInterface{
    fun execute(sum:Int)
}