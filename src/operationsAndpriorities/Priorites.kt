package operationsAndpriorities

fun main(args:Array<String>){
/*
Priorities of operators:
1- ()
2- ++ and -- (before the variable)
3- ^
4- * and /
5- + and -
6- =
7- ++ and -- (after variable)
 */
    var n1:Int=10
    var n2:Int=10
    var n3:Int=10
    var sum:Int?
    sum=n1+n2*n3/3 //based on priority : n2*n3 = 100 -> n2*n3's result /3 =>33 (since its declared as Int) -> n1+33=43 is the sum
    //we can use ( ) to separate the variables
    println("Sum is:$sum")


    var x=10
    var y=11
    var result=++x+y //priority is for ++x (same as x=x+1 similarly --x is same as x=x-1) i.e, in this 11 will be added with y
    println("Result:$result")

    var a=5
    var b=4
    var total=a+b-- //even though b-- is executed the value is not effected in this state due to priority
    println("b vale will be:$b") //value of b will be 3 here
    println("total:$total")//total will be 9

    var m=10
    var n=10
    var z=m+++n //value is read from 'm' ->10 added it to n -> 20 => equated to z=20 then incremented ++ for m i.e 11
    //so based on operator priority these details will be displayed.
    println("m value is:$m")
    println("z value is:$z")
}