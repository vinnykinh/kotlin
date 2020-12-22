package com



fun main() {
    //filter ->filter the desired results
    //map -> inmodifie form
    //predicate -> condition that return true or false
    //flat map
    //distinct

    val myNumbers =    listOf<Int>(2,3,4,23,90)
    val smallNo = myNumbers.filter { it<10 }
   for (i in smallNo)
   {
       println(i)
   }
    //square of all numbers
    val squareNo = myNumbers.map { num -> num * num  }

    val mySmallSquaredno  =myNumbers.filter { it<10 }.map { it*it  }
    for (i in mySmallSquaredno)
    {
        println("\n $i")
    }

    val wasee = listOf<MSee>(MSee(20,"Willy"), MSee(32,"James"), MSee(19,"Samwel"), MSee(23,"Janey"))
    val names = wasee
        .filter { mSee -> mSee.name.startsWith("W")}
        .map { it.name }
    for (name in names)
    {
        println(name)
    }
}
data class MSee (var age:Int, var name:String)
