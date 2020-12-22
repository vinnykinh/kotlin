package com

fun main() {
    var user1 = User("karimi", 5050)
    var user2 = User("karimi", 5050)
    if (user1 == user2) {
        println("Equal")
    } else {
        println("the objects are not equal")
    }
    println(user1.toString())
    var newUser = user1.copy(id = 900)
    println(newUser)

    //one is able to copy data


}

//deals with data not objects
data class User(var name: String, var id: Int) {
//in data classes primary constructor should always contain properties
}


data class places(var travels: String, val description: String)

data class userInfo( var userMap: List<places>)

private fun generate(): userInfo {
    return userInfo(
        listOf(

        )
    )


}