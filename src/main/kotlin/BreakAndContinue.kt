class BreakAndContinue {
}

fun main(){

    val nums = intArrayOf(1,2,3,4,5,6,7,8,9)

    for (num in nums) {
        if (num % 2 ==0) continue
        if (num > 6) break
        println(num)
    }

}