package loops

class loopIndices {
}
fun main(){
    //Usinig any type of array we can implement 'indices'
   val letters = charArrayOf('A','B','C','D','E')
    for (index in letters.indices){
        println("$index - ${letters[index]}")
    }
    println("Now Lets make it reverse")
    for (index in letters.indices.reversed()){
        println("$index - ${letters[index]}")
    }

}