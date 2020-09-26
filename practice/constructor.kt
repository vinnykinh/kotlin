package com.practice
fun main() {
    var student  = Student(regNo = "Vincent Karimi",name = "E022-01-0697/2019")
    println(student.regN0)
}
class Student/*primary*/ constructor(var name:String){
    var regN0:String = ""
    init {
       println("Student name is $name")
    }
    //properties cannot be included in secondary constructors\
    constructor(regNo:String, name:String):this(name)
    {
        this.regN0 = regN0
    }
}