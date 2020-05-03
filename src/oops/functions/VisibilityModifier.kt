package oops


open class Operations_(){ // by default all classes  are final to inherit this class we need to make the class modifiable so making it 'open'

    public var someVariable:Int?=100 //by default someVariable is public
    protected var protectedVar:String?="Protected Vaiable"
    private var privateVaiable:Int?=5 //This variable cant be accessed outside Operations_() class

    fun add(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun sub(n1:Int,n2:Int):Int{
        return n1-n2
    }


}
class MathOperation_():Operations_(){ //Inheriting from above class
    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
    fun getSomeVar():Int?{
        println("Can access protected vaiable too:${super.protectedVar}")
       return super.someVariable
    }
}

fun main(args:Array<String>){
    var mathOper=MathOperation_()
    /*
    All 4 operations are performed using this object since it inherits 'add' and 'sub' methods from Operation class
     */
    println(mathOper.div(3,3))
    println(mathOper.sub(3,3))
    println(mathOper.add(3,3))
    println(mathOper.mul(3,3))
    println("Accessing SOme public Vaiable: ${mathOper.someVariable}")
    //println("Accessing SOme protected Vaiable: ${mathOper.protectedVar}")
//cant access protectedVar outside child class - protected variable can be accessed only in child class
    var oper=Operations_()
    println(oper.sub(3,3))
    println(oper.add(3,3))


}

