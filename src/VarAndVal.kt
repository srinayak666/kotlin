fun main(args:Array<String>){

    /*When a variable is declared as var i.e, it can be read and write multiple times.
    * we can reassign it multiple times with same DataType values. */
    var name:String="Some String"
    println(name)
    name="changing value of String"
    println(name)

    /*
    To make variable ReadOnly define it as val i.e, once assigned it will not able to change the value
     */
    val testString:String="Test String"
    print(testString)
    //testString="ABC" - Val cannot be reassigned -

}