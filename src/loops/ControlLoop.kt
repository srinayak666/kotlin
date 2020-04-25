package loops

fun main(args:Array<String>){

   for(count in 1..100){

       if(count ==2) continue // if count ==2 the control again goes to the loop it will no execute rest of the loop

       println("Count vale is:$count")
       if(count==8) break //it will break the loop when count is 8 and rest of the loop will not be executed

   }
    /*
    while using in nested for loops, it will break or continue the loop which is running.
     */

    for(i in 1..5){
        println("Outer Loop value:$i")
        for(j in 1..7){
            if(j==2) break; // this will break only internal loop
            println("Inner loop value:$j")
        }
    }


    /*
    How to break external loop from internal loop?
    Give a label for the loop as below
     */

    outerForLoop@ for(i in 1..5){
        println("Break Outer Loop value:$i")
        for(j in 1..7){
            if(j==4 && i==3) break@outerForLoop
            println("Break Inner loop value:$j")
        }

    }
}