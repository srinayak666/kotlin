fun main(args:Array<String>){

    //when condition
    println("Enter value of x")
    var x:Int= readLine()!!.toInt()

    when(x){
        /*when there is single line need to be executed we can use arrow function as below ->

        */
        1,2-> println("entered 1 or 2")
        3 -> println("entered 3")
        4 -> println("entered 4")
        5 -> println("entered 5")
        6 -> println("entered 6")
        6 -> println("---- entered 6") // above condition will be executed
        in 10..30 -> println("number is in range between 10 and 30") //in is used to check the enter number in range
        !in 10..30 -> println("number is NOT in range between 10 and 30")
        else -> println("entered number is out of range")

    }

    var age=30
    var isYoung=when(age){
        30 -> true
        else -> false
    }
    println("Is young:$isYoung")



}