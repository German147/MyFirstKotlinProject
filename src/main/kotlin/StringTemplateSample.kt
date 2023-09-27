class StringTemplateSample {
}

fun main(){

    val age = 20
    val name = "german"
   // val msg = " My name is $name and I am ${age + 20}"
    val msg = " My name is ${name.uppercase()} and I am ${age + 20}"
    println(msg)
}