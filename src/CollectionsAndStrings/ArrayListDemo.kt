package CollectionsAndStrings

fun main(args:Array<String>){


    var arrList=ArrayList<String>()
    arrList.add("A")
    arrList.add("Ab")
    arrList.add("Abc")
    arrList.add("Abcd")
    arrList.add("Abcde")

    for(item in arrList){
        println("Item:"+item)
    }
    arrList.set(1,"XYZ")

    for(item in arrList){
        println("Item after SET:"+item)
    }
    if(arrList.contains("XYZ")){
        println("Hi found!")
    }



}