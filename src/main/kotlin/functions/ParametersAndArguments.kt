package functions

fun main(){
    //We can also explicity say the arguments we want, and also change the order
    greet2(age=41,name="Laura")
    greet2(name="Lucy",age=10)
   greet2("German",40)
   greet2("Marti",7)
   greet2("Lean",10)
   greet2("Evange",43)

}

fun greet2(name: String, age: Int) {
    println("Hello Parameter $name")
    if (age>=16){
        println("$name is and adult")
    }else{
        println("$name is NOT and adult")
    }
}
