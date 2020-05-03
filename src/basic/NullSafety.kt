package basic

fun main(args:Array<String>){

    var name:String="newString"
   // name=null //this line will cause an issue : Error:(4, 10) Kotlin: Null can not be a value of a non-null type String
    //to make name redeclare as nul we need to specify String with ? signifying type safety
    println(name)

    var text:String?="some text"
    text=null
    println(text) //OutPut: null

    var data:String?
    data=null
    //println(data!!) //Exception in thread "basic.basic.main" kotlin.KotlinNullPointerException
    data="data"
    println(data!!) //!! this variable data should have to have a value;
}