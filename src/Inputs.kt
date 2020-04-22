fun main(args:Array<String>){
    /*getting input from console*/

    var name= readLine()
    //this will wait for input in console and reads the input value and assign it to name
    //pressing enter will return and assigns the value and displays below line.
    //The input type will be always String? so we can't declare as any other Data type
    println("Name entered is:"+name)


    var age:Int= readLine()!!.toInt()
    //!! signifies NullSafety
    // convert entered String to integer using toInt() method
   //if number/Integer is not provided it will throw java.lang.NumberFormatException
    println(age)


}