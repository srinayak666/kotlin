package oops

class Car(var type:String,var model:Int,var price:Double,
          owner:String,var milesDriven:Int){
    //define the value when Car instance is created
    //to make the values read and write enabled define each variable with 'var' at starting
    //for example except owner all fields can read and write
init{
//this is a method which runs when class Car is initialized
        //and its not mandatory to declare this method
println("Class Car is created of with details: $type,$model,$price,$owner,$milesDriven")
}

    //All fields defined in class (i.e, type,model,price.. ) set and get methods are defined by kotlin
    //so if we try to define set and get again for specific field it will cause an error
    //for example
    /*fun getPrice():Double{
        //compiler will complain if we write this method
    }*/

    fun getCarPrice():Int{
        return 2222;
    }

}
fun main(args:Array<String>){
   val sampleCar=Car("BMW",1997,30000.99,"Test",5555);
    println("Model of the car is: ${sampleCar.model}")
    println("Changing model to 2020")
    sampleCar.model=2020
    //println(sampleCar.owner) -- owner can't be accessed becos its not declared with var variable
    println("Model of the car after changing model is: ${sampleCar.model}")

    println("New car price is: ${sampleCar.getCarPrice()}")
    val testCar=Car("KIA",2000,8787.9,"Kia test",87878)

}

