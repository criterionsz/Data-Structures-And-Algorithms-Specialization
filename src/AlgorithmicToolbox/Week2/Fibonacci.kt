import java.util.*
import kotlin.collections.ArrayList

fun calcFib(n: Long): Long {
    return if (n <= 1) n else calcFib(n - 1) + calcFib(n - 2)
}

fun calcFibFast(n: Long): Long {
    var a: Long = 0
    var b: Long = 1
    var c: Long = 0
    for(i in 0 until (n-1)){
        c = a+b
        a = b
        b = c
    }
    return c
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    println(calcFibFast(n))
}