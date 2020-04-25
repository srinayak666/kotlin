package DecisionMaking

fun main(args:Array<String>){

    //if- else condition
    println("Enter value of x")
    var x:Int= readLine()!!.toInt()

    println("Enter value of y")
    var y:Int= readLine()!!.toInt()


    if(x>y){
        println("x is greater than y")
    } else{
        println("x is lesser than y")
    }

    /*
    if else in a single line
     */
    var max=if(x>y) x else y
    println("MAX:"+max)
}