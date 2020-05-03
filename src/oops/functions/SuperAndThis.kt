package oops

open class C1{
    var x=100

    constructor(){
        println("Constructor C1 is called")
    }
    open fun doThis(){
    println("Do This() method from C1 is called")
    }
}

class C2:C1{
    constructor():super(){
        println("Constructor C2 is called")
        println(super.x)
       super.doThis()
    }
    override  fun doThis(){
        super.doThis()
        println("Do This() method from C2 is called")
    }


}

fun main(args:Array<String>){
    var c1=C1()
    c1.doThis()

    var c2=C2()
    c2.doThis()

}

