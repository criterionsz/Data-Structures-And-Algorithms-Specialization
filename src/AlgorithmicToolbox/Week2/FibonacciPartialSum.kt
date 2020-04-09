import java.util.*

fun getFibonacciSumFast2(n: Long, t: Int): Long{
    if (n%60 <= 1) {
        if(t == 1)
            return 0
        else
            return n%60
    }
    var previous = 0L
    var current = 1L
    var c = 1L
    var sum = 1L
    for(i in 1 until (n%60 - t)){
        c = (previous+current)%10
        previous = current
        current = c
        sum = (sum+ c)%10
    }
    return sum
}
fun getFibonacciPartialSumFast(from: Long, to: Long): Long{
    if (from == 0L && to == 0L)
        return 0
    var sumFrom = getFibonacciSumFast2(from, 1)
    var sumTo = getFibonacciSumFast2(to, 0)
    if (sumTo<sumFrom){
        sumTo+=10
        return sumTo - sumFrom
    }
    return sumTo - sumFrom
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val from = scanner.nextLong()
    val to = scanner.nextLong()
    println(getFibonacciPartialSumFast(from, to))
}