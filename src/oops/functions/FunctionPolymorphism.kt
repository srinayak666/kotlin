package oops.functions

fun main(args:Array<String>){
    display("Hello")
    display(20)
    display(22.77)

}
/*
Having a function with same name, same number of parameters with different Data Types is called Polymorphism
 */
fun display(data:String):Unit{
 println("data: $data")
}
fun display(data:Int):Unit{
    println("data: $data")
}
fun display(data:Double):Unit{
    println("data: $data")
}