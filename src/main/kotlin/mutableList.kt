class mutableList {
}
fun main(){
    val names = mutableListOf<String>("evange","marti","Lean","german")

    names.add("Laura")
    println(names)
   names.remove("marti")
    println(names)

}