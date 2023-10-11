package functions

import basic.AnyKeyWord

fun main(){

    val result = sumInt(4)
    println(result)

    val word = changeToUpperCase("samsung")
    println(word)
}

fun sumInt(number: Int):Int {
   return number + 2
}

fun changeToUpperCase(word: String):String{
    var result = word.uppercase()
    return result
}


