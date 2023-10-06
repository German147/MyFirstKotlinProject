class ArraysPart2 {
}
fun main(){

    val names = arrayOf("evange","marti","Lean","german")

    if("martin" in names){
        println("Yes, it is in the array")
    }else{
        println("No, it is not in the array")
    }

    val arrayOfNulls = arrayOfNulls<String>(size = 5)
    arrayOfNulls[2]="German"
    println(arrayOfNulls.contentToString())

}