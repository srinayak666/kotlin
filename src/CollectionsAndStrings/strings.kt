package CollectionsAndStrings

fun main(args:Array<String>){

    var string_data="This is String Data"
    print(string_data)
    /*
    print - prints in one line
    println- prints and then adds a new line
     */
    /*
    concatenate
     */
    println("Hello"+string_data)
    println("Hello, $string_data")
    println("Second Character of String: "+string_data[1])
    println("To lower case:"+string_data.toLowerCase())
    println("Split String:"+string_data.split(" "))


}