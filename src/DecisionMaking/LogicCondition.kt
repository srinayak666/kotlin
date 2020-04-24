package DecisionMaking

fun main(args:Array<String>){
    var x=3
    var y=5
    var z=10
    var w=11
    var flag=true

    /*
    Logical operators always results in value: true or false
     */
    println("> Logical symbol->"+(x>y))
    println("< Logical symbol->"+(x<y))
    println("== Logical symbol->"+(x==y))
    println("!= Logical symbol->"+(x!=y))
    println("! Logical symbol->"+(!flag))


    /*
    true || false // Evaluates true because the first is true
    false || true // Evaluates true because the second is true
    true || true // Evaluates true because both are true
    false || false // Evaluates false because both are false
     */
    println("|| Logical symbol->"+(x<y || w>z))


    /*
    true && false // Evaluates false because the second is false
    false && true // Evaluates false because the first is false
    true && true // Evaluates true because both are true
    false && false // Evaluates false because both are false
     */
    println("&& Logical symbol->"+(x<y && w<z))


}