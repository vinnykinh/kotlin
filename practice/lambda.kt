fun main() {
  val total =Total()
    total.multiplication(30,30 ,{x,y ->x*y })

}
class Total{
    fun  multiplication(a:Int,b:Int ,lmbda:(Int,Int) ->Int){
        val result = lmbda(a,b)
        println(result)
    }
}