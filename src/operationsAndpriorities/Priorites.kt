package operationsAndpriorities

fun main(args:Array<String>){
/*
Priorities of operators:
1- ()
2- ^
3- * and /
4- + and -
5- =
 */
    var n1:Int=10
    var n2:Int=10
    var n3:Int=10
    var sum:Int?
    sum=n1+n2*n3/3 //based on priority : n2*n3 = 100 -> n2*n3's result /3 =>33 (since its declared as Int) -> n1+33=43 is the sum
    println("Sum is:$sum")
}