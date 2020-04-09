import java.util.*

fun getChange(m: Int): Int {
    var n = m
    var k = 0
    while (n>9) {
        n -= 10
        k+=1
    }
    while(n>=5) {
        n -= 5
        k+=1
    }
    return k+n
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val m = scanner.nextInt()
    println(getChange(m))
}