package loops

class ForLoop {
}
fun main(){
    val names =listOf("luna","gaturro","tom","Jerry")
    val numbers =intArrayOf(1,2,3,4,5,6,7,8,9,10)

    for (name in names){
        val n = name.replaceFirstChar { it.uppercase() }
        println(n)
    }


    println("------------------------")
    for (num in numbers){
        println(num)
    }
}