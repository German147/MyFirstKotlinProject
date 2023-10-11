package arraysAndLists

class ListSample {
}

fun main(){
    //Returns a new read-only list of given elements.
    // The returned list is serializable (JVM)
    val names = listOf<String>("basic.ger",
    "evange","lean","mar")
    println(names[0])
    println(names.size)
    println(names.contains("Luc"))
    println(names.contains("mar"))
    println(names.last())
    println(names.first())
    println(names.indexOf("lean"))
}