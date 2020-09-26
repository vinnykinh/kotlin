package com

fun main() {
  //!var people =People()
    //cannot create objects of abstract classes

}

//
abstract  class People {
    //abstract provide methods and properties to be instanciated in derived classes
    //you cannot instanciate any abstract method or property
    abstract var name:String
    //all abstract functions are open hence no reason to declare them explicitly
    abstract fun eat() //no body
    open fun getName(){}   // open function can be accessed in the sub classes of this super class
    fun getHeight(){} //normal function //default and public/final

}
class African:People()
{
    override var name: String ="name"
    override fun eat() {

    }

   // override var name: String ="african name"

}