package com

fun main() {
    MyClass.typeOfCustomers()

}
class MyClass{
    companion object {
        @JvmStatic
        fun typeOfCustomers():String{
            return "African"
        }
    }
}