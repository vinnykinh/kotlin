fun main(args: Array<String>) {
    val food =Food()
    food.juicy()
    food.arrowRoots()

}
class Food:fruits,Tubers{
    override fun juicy(){
       println("Cut::Splash::")
    }
    override fun arrowRoots(){
        println("ArrowRoots")
    }

}
interface fruits{
    abstract fun juicy()
     
}
interface Tubers{
    abstract fun arrowRoots()
}