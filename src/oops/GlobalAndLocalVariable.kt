package oops
 var name:String="Global Variable"
fun main(args:Array<String>){
var local_vaiable="Local Variable"
    println("This can be accessed only in this function: $local_vaiable")
    println("This can be accessed in all the functions:$name")
    display()
}
fun display():Unit{
    println("This can be accessed in all the functions:$name")

}