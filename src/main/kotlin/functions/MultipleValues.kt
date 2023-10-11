package functions

fun main(){

    val (v1,v2) = twoValues()
    println("$v1 $v2")
    val (t1,t2,t3) = threeValues()
    println("$t1 $t2 $t3")
}

fun threeValues():Triple<String, Int, Char> {
    return Triple(
        "MyFirstValue",
        52,
        'c'
    )
}

fun twoValues():Pair<String, Int> {
return "AmigosCode" to 20
}
//fun twoValues():Pair<String, Int> = "AmigosCode" to 20


fun twoValues2():Pair<String, Int> = Pair("AmigosCode",20)
