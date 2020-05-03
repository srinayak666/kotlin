package oops.functions

val x=100 //value once declared can't be changed
fun main(args:Array<String>){

var sum= sum(10.1, 21.2)
    println("sum is: $sum")
    justPrint("Sample Text")
}
fun sum(n1:Double,n2:Double):Double{
//function with return type double and takes 2 parameters
    return n1+n2
}
fun justPrint(thing:String):Unit{ //Unit is nothing but void in Java its not mandatory to have Unit if function wont return anything
    //function does't return anything but accepts 1 parameter
    println("Print this thing:$thing")
    println("Value of x is:$x")
}