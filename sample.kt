fun main(){
val multiplication = Multiplication() 
val result:Int= 0 
val lambda:(Int,Int) ->Int = {x,y-> x+y}
multiplication.multiply(23,45,lambda)

}
class Multiplication{

fun multiply(x:Int,y:Int , lambda:(Int,Int) -> Int )
{
val sum:Int = lambda(x,y)
println(sum) 


}
}
