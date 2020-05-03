package CollectionsAndStrings

fun main(args:Array<String>){
    var map= hashMapOf<Int,String>(1 to "XYZ",2 to "MON")
    map.put(3,"CCC")
    map.put(3,"ddd")

    println("Map value for:${map.get(3)}")
    println("Another way:"+map[3])


    var arr= arrayOf(1,2,3,4,5,6)
    //arr[9]=44 Exception in thread "basic.basic.main" java.lang.ArrayIndexOutOfBoundsException: 9
    arr[2]=99
    println(arr[2])



    var list= listOf("r","y","x")
    //once defined you cannot change value in it- Immutable
   //list.add("ff")

    for(i in list){
        println("List item:"+i)
    }

    //mutable list
    var muList= mutableListOf(1,2,3,4,5)
    println(muList.size)
    muList.add(100)
    muList[2]=33
    for (i in 0..muList.size-1){
        println("Value of elem:"+muList[i])
    }

//immutable set
    var set= setOf(1,2,3,3,4,4,5,5,6,6,2,1,2)
    println("size of set:"+set.size)

    for(item in set){
        println("Set Item:"+item)

    }
    //mutable set
    var set_= mutableSetOf<String>()




}