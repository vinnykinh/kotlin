package com.practice

fun main() {
    // val kenya = Kenya(continent = "Africa", counties = 47)
    //println(kenya.counties)
    //println(kenya.continent)
    val kenya =Kenya("Africa","47")
    //kenya.continent
}

open class Country{
    var continent: String = ""

    constructor(continent: String) {
        this.continent = continent
        println(
            "From country $continent"
        )
    }
}

class Kenya : Country {
    var counties: String = ""

    constructor(continent: String, counties: String) : super(continent) {
        this.counties = counties
        println(
            "from kenya $continent and $counties counties"
        )
    }


}