package arraysAndLists

class Arrays {
}
fun main(){
    //Returns an array containing the specified elements
    val names = arrayOf("evange","marti","Lean","german")

    println(names[0])
    println(names[1])
    println(names[2])
    println(names[3])
    println(names.contentToString())
    println("The number of names is " + names.size + " into this array")
    println("here is the sorted array "+ names.sortedArrayDescending().contentToString())
}