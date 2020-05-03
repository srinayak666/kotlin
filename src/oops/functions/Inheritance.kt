package oops


open class Operations(){ // by default all classes  are final to inherit this class we need to make the class modifiable so making it 'open'
    fun add(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun sub(n1:Int,n2:Int):Int{
        return n1-n2
    }
}
class MathOperation():Operations(){ //Inheriting from above class
    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
}

fun main(args:Array<String>){
    var mathOper=MathOperation()
    /*
    All 4 operations are performed using this object since it inherits 'add' and 'sub' methods from Operation class
     */
    println(mathOper.div(3,3))
    println(mathOper.sub(3,3))
    println(mathOper.add(3,3))
    println(mathOper.mul(3,3))

    var oper=Operations()
    println(oper.sub(3,3))
    println(oper.add(3,3))


}

