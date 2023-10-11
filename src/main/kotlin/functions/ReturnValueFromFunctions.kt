package functions

import basic.AnyKeyWord

fun main(){

    val result = sumInt(4)
    println(result)

    val word = changeToUpperCase("samsung")
    println(word)

     val res = singleFunc(3)
    println(res)

    val res2 = avoidReturnType(4.2)
    println(res2)
}

fun sumInt(number: Int):Int {
   return number + 2
}

fun changeToUpperCase(word: String):String{
    var result = word.uppercase()
    return result
}

//Using single function expression we don't need the curly brace
fun singleFunc(num:Int):Int = num * 2
//we can also avoid the return type in single function expression
fun avoidReturnType(num:Double) = num + 4



