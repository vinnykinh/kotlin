package com.practice

fun main() {
     val multiply  =Multiply()
    multiply.multiplyTwoNumbers(20,20,object :multiplyInterface{
        override fun execute(product: Int) {
            println("by object oriented programming the product is $product")
        }

    })
    val lambda:(Int) ->Unit ={product:Int -> println("${product}")}

    multiply.multiplyTwoNumbers(20,10,lambda )
}
class Multiply{
    fun multiplyTwoNumbers(x:Int,y:Int){
        val product =x*y
        println(product)

    }
    fun multiplyTwoNumbers(x:Int,y:Int,multiplyInterface: multiplyInterface){
        val product =x*y
        multiplyInterface.execute(product)

    }
    fun multiplyTwoNumbers(x:Int,y:Int,lambda:(Int)->Unit){
        val product =x*y
        lambda(product)

    }

}
interface multiplyInterface{
    abstract  fun execute(product:Int)


}