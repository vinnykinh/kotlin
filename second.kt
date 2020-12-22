package com

import com.myInterface as myInterface1
fun main()  {
   val derived =Derived()
    derived.goJogging()
    var mylambda: (String,String) -> (String) = { x,y -> x+y }
    val main =Main()
    main.addTwoStrings("Vincent" ,"go jogging", {x,y ->x+y })

}
open class Main:Interface{

    fun String.addTwoStrings(other:String):String{
        return this + other
    }

    override var string: String ="Vincent"
    override var message: String ="go jogging"
    fun addTwoStrings(st:String,b:String, lambda: (String,String)->String)
    {
        val sum  = lambda(st,b)
        println(sum)
    }

}
class Derived :Main(),secondInterface
{
    override fun goJogging() {
        super<Main>.goJogging()
        super<secondInterface>.goJogging()
        println("then go to the gym")
    }
}
interface Interface{
    fun goJogging(){}
    abstract var string:String
    abstract var message:String

}
interface  secondInterface{
    open fun goJogging(){
        println("Exercise is key to good life ")
    }
}
