package DecisionMaking

fun main(args:Array<String>){

    //if- else condition
    println("Enter value of x")
    var x:Int= readLine()!!.toInt()

    println("Enter value of y")
    var y:Int= readLine()!!.toInt()


    if(x>y){
        println("x is greater than y")
    } else if(x<y){
        println("x is lesser than y")
    }else{
        println("x is equal to y")
    }

}