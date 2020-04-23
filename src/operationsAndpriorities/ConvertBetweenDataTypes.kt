package operationsAndpriorities

fun main(args:Array<String>){
/*
Different methods to convert between Data Types:
toByte()
toShort()
toInt()
toLong()
toFloat()
toDouble()
toChar()
 */

    var n1:Int=10
    var n2:Int?
    var numString:String="11"
    n2=numString.toInt() //converting String to Integer
    println(n1+n2)

    var floatNum:Float
    floatNum=numString.toFloat()
    println(n1+floatNum)

    var doubleNum:Double=4.44
    println(doubleNum)
   var intnum:Int
     intnum=doubleNum.toInt()
    println(intnum.toString())



}