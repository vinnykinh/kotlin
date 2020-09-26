package com.extensionFx

fun main() {
    val str1:String ="Hello"
    val str2:String = "world"
    val str3:String ="hey"
    println(str3.add(str2,str1))

    val x :Int=6
    val y:Int = 10
    println("${x.greaterValue(y)} is greater")

 var student =Student()
    println("pass status : ${student.hasPassed(40)}")
    println("Scholarship status:${student.isScholar(98)}")
}
fun Int.greaterValue(other:Int):Int{
    if (this>other)
    {
        return  this
    }
    else
    {
        return other
    }
}
fun String.add(s1:String,s2:String):String{
    return this + s1 +s2
}


fun Student.isScholar(marks:Int):Boolean{
    return marks>90
}
class Student{
    fun hasPassed(marks:Int):Boolean
    {
        return marks>70
    }
}