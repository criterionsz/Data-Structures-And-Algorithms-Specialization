import java.util.*

fun maxDotProduct(a: LongArray, b: LongArray): Long {
    a.sort()
    b.sort()
    var result: Long = 0
    for (i in a.indices) {
        result += (a[i] * b[i]).toLong()
    }
    return result
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val a = LongArray(n)
    for (i in 0 until n) {
        a[i] = scanner.nextLong()
    }
    val b = LongArray(n)
    for (i in 0 until n) {
        b[i] = scanner.nextLong()
    }
    println(maxDotProduct(a, b))
}