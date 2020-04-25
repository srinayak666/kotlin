package loops

fun main(args:Array<String>){

    //i is index
    // in is used to specify range
    //here range is 1 to 5 => 1,2,3,4,5
    //if 0..5 then 0,1,2,3,4,5
    //-2..5 then -2,-1,0,1,2,3,4,5
    for(i in -2..5){
        println("Hello From For Loop $i")
    }
}