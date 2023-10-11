class ForEach {
}

fun main(){

    val names = arrayOf("evange","marti","Lean","german")

    for (name in names) println(name)
    println("Here is the forEach")
    names.forEach { println(it) }

}