package basic

class MultiLineStrings {
}

fun main(){

    var name = "German"
    var surname = "Barrera"

    val msg = "My name %s is $name and my surname is $surname"
    println(msg.format("an old name"))

    val emai = """
        Hi %s
        this 
        is  my 
        Multiline Strings
    """.trimIndent()

    println(emai.format("Little DGerman"))
}