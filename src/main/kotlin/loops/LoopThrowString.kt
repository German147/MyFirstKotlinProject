package loops

class LoopThrowString {
}
fun main(){
    val brand = "AmigosCode"
//Here we can use any method from the arrays, list and so on
    for (c in brand.replaceFirstChar { it.lowercase() }) {
        println(c)
    }
    println("Reverse")
    for (c in brand.indices.reversed()) {
        println(c)
    }

}