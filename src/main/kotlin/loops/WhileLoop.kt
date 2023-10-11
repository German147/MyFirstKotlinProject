package loops

class WhileLoop {
}
fun main(){

    var number = 1
    while (number <=5){
        println("The number is $number")
        ++number
    }

    println("Decrementing...")
    var decrementing = 5
    while (decrementing >=0){
        println("The number is $decrementing")
        --decrementing
    }
}