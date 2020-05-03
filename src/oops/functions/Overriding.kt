package oops

open class ParentClass(){
open fun sampleFunction():Unit{ //need to make the function as open if we need to override in child class

    println("Parent Sample Function")
}
     fun parentFunction(){
        println("Parent Function")
    }
    fun parentFunction_2(){
        println("Parent Function _2")
    }
}
class ChildClass():ParentClass(){
    override fun sampleFunction():Unit{ //need to use keyword override to say we r overriding from parent
        println("Child Sample Function")
    }
    fun childFunction_2(){
        println("child  Function _2")
    }
}

fun main(array: Array<String>){
    var cc=ChildClass()
    cc.sampleFunction()
    cc.parentFunction()

    var pc=ParentClass()
    pc.parentFunction()
    pc.sampleFunction()

    //type casting
    var cc1=ChildClass() as ParentClass
    cc1.parentFunction()
    cc1.sampleFunction()
    cc1.parentFunction_2()


    /*
     var cc2=ParentClass() as ChildClass
        Exception in thread "basic.basic.main" java.lang.ClassCastException: oops.ParentClass cannot be cast to oops.ChildClass
*/
}

