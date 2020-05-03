package oops.functions

fun main(args:Array<String>){

    println("Sum with Int's:${sum(10, 20)}")
    println("Sum with Floats's:${sum(10.4, 20.3)}")
    println("Sum with 3 Int's:${sum(10, 20, 50)}")
}


fun sum(n1:Int,n2:Int):Int{
    return n1+n2
}
fun sum(n1:Int,n2:Int,n3:Int):Int{ //overloading sum function which holds 3 parameters
    return n1+n2+n3
}