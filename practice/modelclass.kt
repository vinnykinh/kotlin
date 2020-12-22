

fun main() {
  val retrieve = Retrieve()
  retrieve.addUser("Vincent Karimi")




}
class Retrieve{
   val userList =  ArrayList<String>()
   fun addUser(name:String){
      (userList).add(name.toString())
      for(i in userList)
      {
         println(i)
      }
   }

}