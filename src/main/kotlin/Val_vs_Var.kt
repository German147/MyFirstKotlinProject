class Val_vs_Var {
}

fun main(){
    //here we have the equivalent of "private final String"
    // which design a variable to b e immutable
    var brandVar = "AmigosCode"
    brandVar = "germanCode"

    val brandVal = "AmigosGer"
    //brandVal = "CocoGer"  here if we uncomment this line throws an error.
    // It is not possoble to reasign a new value

}