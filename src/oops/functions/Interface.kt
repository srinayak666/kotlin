package oops

interface op{
    fun sum(n1:Int,n2:Int):Int;
    fun mul(n1:Int,n2:Int):Int;
    fun div(n1:Int,n2:Int):Int{
        return n1/n2;
    }
}
class opImpl:op{
    override fun sum(n1: Int, n2: Int): Int {
            return n1+n2;
    }

    override fun mul(n1: Int, n2: Int): Int {
            return n1*n2;
    }

}


fun main(args:Array<String>){

        var opi=opImpl()
        println(opi.mul(1,4))
        println(opi.sum(2,6))
         println(opi.div(24,6))
}

