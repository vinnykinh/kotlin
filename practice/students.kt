package com.practice

fun main() {
    val mecht = Mechatronics()
    println(mecht.name)
    println(mecht.title)
    mecht.courseOutline()
    mecht.about()
    println("\n")

    val mech =Mechanical()
    mech.about()
    println(mech.title)
    mech.courseOutline()
}
open class EngineeringStudents(){
    val title:String ="This is an engineering course"
    fun courseOutline(){
        val semesters:Int = 10
        val exams:Int =20
        println("You will do ${exams} exams in ${semesters} semesters")
    }
}
class Mechatronics:EngineeringStudents(){
    val name:String ="Mechatronics"
    fun about(){
        val description:String ="This is all about advanced mechanics and computer controlled electro-mechanical engineering"
        println(description)
    }
}
class Mechanical:EngineeringStudents(){
    val name:String = "Mechanical"
    val name2:String ="Engineering"
    fun about(){
        println(name.Add( name2))
        val description:String ="This is all about mechanical modelling and thermo-dynamic and pneumatic systems"
        println(description)
    }
    private fun String.Add(other:String):String{
        return this + other
    }
}
