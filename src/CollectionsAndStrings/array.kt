package CollectionsAndStrings

fun main(args: Array<String>){


    var arrayInt=Array<Int>(5){100}
    var arraySTr=Array<String>(3){"---"} //setting initial values to array
    for(strI in 0..arraySTr.size-1){
        println("STring value at index: $strI"+arraySTr[strI])
    }

var i=0


while(i<arrayInt.size) {
    println(arrayInt[i])
    i++
}

    for(ele in arrayInt){
        println("Element:"+ele)
    }

    for(index in 0..arrayInt.size-1){
        println(arrayInt[index])
    }
}


