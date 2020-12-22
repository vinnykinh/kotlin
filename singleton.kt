package com

fun main() {
    student.id =20
    student.myMethod("First class")
}
//one instance
//no need to create abjects in singleton
open class MySuperClass{
    open fun myMethod(string: String){
        println("mysuperclass")
    }
}
object student:MySuperClass()  {
    var id:Int =-1 //behaving as static variables
    fun registerCustomer(){
        //static method
    }

    override fun myMethod(string: String) { //static method in the student object
        super.myMethod(string)
        println("object student $string")

    }
    init {
        //cannot have any constructors in objects
    }
}