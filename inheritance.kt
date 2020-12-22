fun main(){
val student = student() 
student.info()
student.info2()



}
open class School(){

fun info(){

println("This is the inherited fx")
}
}
class student:School(){
   fun info2(){
   println("this is the sub class")
   
   }
   
}
