package oops

class CarExample(){
    var type:String?=null
    var mile:Int?=null
    var owner:String?=null
    val PRICE:Double=6000.78
    constructor(type:String,mile:Int,owner:String):this(){
        this.type=type
        this.mile=mile
        this.owner=owner
    }
    constructor(owner:String):this(){
        this.owner=owner
    }
    fun getCarPrice():Double{
        return PRICE
    }




}


fun main(args:Array<String>){

    var carExample=CarExample("Tommy")
    println("Car Details:${carExample.owner}")
    println("Car Details:${carExample.PRICE}")
    println("Car Details:${carExample.mile}") //null
    println("Car Details:${carExample.type}") //null
}

