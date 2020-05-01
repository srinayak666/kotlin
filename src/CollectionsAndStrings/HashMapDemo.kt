package CollectionsAndStrings

fun main(args:Array<String>){


    var map=HashMap<Int,String>()
    map.put(1,"ABC")
    map.put(2,"ABCD")
    map.put(3,"ABCE")
    map.put(4,"ABCDEF")
    map.put(5,"ABCXY")
    map.put(1,"XYZ")

    for(key in map.keys){
        println("Key:"+key)
        println(map.get(key))
    }

}