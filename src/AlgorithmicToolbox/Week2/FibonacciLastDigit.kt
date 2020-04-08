import java.util.*

fun getFibonacciLastDigitNaive(n: Int): Int {
    if (n <= 1)
        return n

    var previous = 0
    var current = 1

    for (i in 0 until n - 1) {
        val tmpPrevious = previous
        previous = current
        current += tmpPrevious
    }

    return current % 10
}

fun getFibonacciLastDigitFast(n: Int): Int {
    var a = 0
    var b = 1
    var c = 1
    for(i in 1 until n){
        c = (a+b)%10
        a = b%10
        b = c
    }
    return c
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val c = getFibonacciLastDigitFast(n)
    println(c)
}