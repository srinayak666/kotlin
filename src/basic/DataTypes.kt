package basic

fun main(args:Array<String>){


    /*
    Kotlin Data Types
    1. Numbers – Byte, Short, Int, Long, Float, Double
    2. Boolean – True, false
    3. Characters
    4. Arrays
    5. Strings
     */
    val num: Byte = 30
    println("$num") //print using $ with variable name.

    //we can find MIN and MAX value of data type as below
    println(Byte.MAX_VALUE)

    var x=10 //declaring and defining a variable in Kotlin
    var y=12

    var name="Kotlin" //declare a String
    var doubledata:Double=20.0 //another way to declare with Data Type

    var _name:String="Kotlin Experiment"
    var age:Int=22 //not mandatory to declare the data type
    var dep:String? //declaring with Optional i.e, 'NULL' safety : and data type declaration is required
    dep="Some Department"


    // This is a float data type as we have suffixed
    // the value with letter 'F'
    val float_num = 101.99F
    println("$float_num")

    //printing above variables declared
    println("y value:"+y)
    println("x value:"+x)
    println("Sum of x and y:"+(x+y))
    println(name)
    println(doubledata)
    println(_name)
    println(age)
    println(dep)
}