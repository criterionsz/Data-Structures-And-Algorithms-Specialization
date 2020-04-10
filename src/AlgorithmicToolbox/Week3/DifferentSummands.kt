import java.util.*

fun optimalSummands(n: Int): List<Int> {
    var arr = arrayListOf<Int>()
    var i = 1
    var t = n
    while(true) {
        if (i < (t - i)) {
            arr.add(i)
            t -= i
            i++
        } else {
            arr.add(t)
            break
        }
    }
    return arr
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val summands = optimalSummands(n)
    println(summands.size)
    for (summand in summands) {
        print(summand.toString() + " ")
    }
}