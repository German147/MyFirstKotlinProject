package functions

fun main(){
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
