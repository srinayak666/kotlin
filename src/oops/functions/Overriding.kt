package oops

open class ParentClass(){
open fun sampleFunction():Unit{ //need to make the function as open if we need to override in child class

    println("Parent Sample Function")
}
}
class ChildClass():ParentClass(){
    override fun sampleFunction():Unit{ //need to use keyword override to say we r overriding from parent
        println("Child Sample Function")
    }
}

fun main(array: Array<String>){
    var cc=ChildClass()
    println(cc.sampleFunction())

    var pc=ParentClass()
    println(pc.sampleFunction())

}

