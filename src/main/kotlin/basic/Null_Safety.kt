package basic

class Null_Safety {
}
fun main(){

    var name = "Jamila"
    println(name.uppercase())
        //Here we can set a null value to a variable only using the "?"
        // at the end of it and the type of.
    var brand : String? = null
    println(brand?.uppercase())

}