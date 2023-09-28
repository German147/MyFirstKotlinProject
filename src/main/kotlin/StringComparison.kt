class StringComparison {
}

fun main(){

    val name1 = "Juan"
    val name2 = "Jamila"
    //using tyhe String() method we create a new object in the heap memory
    val name3 = String("Juan".toCharArray())
    println(name1==name3)
    println("-----------")
    println(name1.equals(name3))

}