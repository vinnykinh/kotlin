package com

fun main() {
    val myBtn = Button()
    myBtn.onClick()
    myBtn.onTouch()
    // this is not possible   ..val myObj =myInterfaceListener()
}
interface mythirdInterfaceListener{
    fun onClick(){
        println("button clicked on interface 3")
    }
}

interface myInterfaceListener { //you cannot create instance of the interface
    //an interface is not a class it acts like a listener
   // var name: String //usually both abstract by default

    fun onClick() {
        //open by default not final
        println("button was clicked on interfaceListener")
    }

    abstract fun onTouch()
}
interface mySecondInterfaceListener { //you cannot create instance of the interface
    //an interface is not a class it acts like a listener
    //usually both abstract by default
    //contains on abstract properties


    fun onClick() {
        //open by default not final
        println("button was clicked on second interfaceListener")
    }

     fun onTouch()
     {
         println("on touch on second interface")
     }
}

class Button : myInterfaceListener,mySecondInterfaceListener,mythirdInterfaceListener {
    override fun onClick() {
        super<mySecondInterfaceListener>.onClick()
        super<myInterfaceListener>.onClick()
        super<mythirdInterfaceListener>.onClick()
    }

    override fun onTouch() {
        super.onTouch()
    }



}