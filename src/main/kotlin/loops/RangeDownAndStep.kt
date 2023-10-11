package loops

class RangeDownAndStep {
}
fun main(){
    println("Range")
    for (i in 1..10) println(i)
    println("DownTo")
    for (i in 10 downTo 1) println(i)
    println("Steps")
    for (i in 1..10 step 2) println(i)
    println("Steps in DownTo")
    for (i in 10 downTo 1 step 2) println(i)
}