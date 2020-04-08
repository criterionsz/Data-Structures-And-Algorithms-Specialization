import java.util.*
import kotlin.collections.ArrayList

fun getFibonacciHugeNaive(n: Long, m: Long): Long {
    if (n <= 1) return n

    var previous: Long = 0
    var current: Long = 1

    for (i in 0 until n - 1) {
        val tmpPrevious = previous
        previous = current
        current += tmpPrevious
    }

    return current % m
}

fun getPisanoPeriod(m: Long): Long{
    var a = 0L
    var b = 1L
    var c = 0L
    for (i in 0 until m*m) {
        c = (a + b)
        a = b
        b = c%m
        if (a == 0L && b == 1L)
            return i + 1;
    }
    return 1

}

fun calcFibFastHuge(n: Long,  m: Long): Long {
    if (n == 0L)
        return 0
    var a: Long = 0
    var b: Long = 1
    var c: Long = 1
    for(i in 1 until n){
        c = a+b
        a = b
        b = c%m
    }
    return b
}

fun getFibonacciHugeFast(n: Long, m: Long): Long {
    if (n <= 1) return n
    var index = n%getPisanoPeriod(m)
    return calcFibFastHuge(index, m)
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val m = scanner.nextLong()
    println(getFibonacciHugeFast(n, m))
}