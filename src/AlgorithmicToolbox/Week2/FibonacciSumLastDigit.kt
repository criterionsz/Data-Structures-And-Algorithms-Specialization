import java.util.*

fun getFibonacciSumNaive(n: Long): Long {
    if (n <= 1)
        return n

    var previous: Long = 0
    var current: Long = 1
    var sum: Long = 1

    for (i in 0 until n - 1) {
        val tmpPrevious = previous
        previous = current
        current += tmpPrevious
        sum += current
    }

    return sum%10
}

fun getFibonacciSumFast(n: Long): Long{
    if (n%60 <= 1)
        return n%60
    var previous = 0L
    var current = 1L
    var c = 1L
    var sum = 1L
    for(i in 1 until n%60){
        c = (previous+current)%10
        previous = current
        current = c
        sum = (sum+ c)%10
    }
    return sum
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    println(getFibonacciSumFast(n))
    //stressTestFibonacciSumLastDigit(::getFibonacciSumNaive, ::getFibonacciSumFast)
}