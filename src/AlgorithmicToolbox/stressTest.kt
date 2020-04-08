package AlgorithmicToolbox

import kotlin.math.min
import kotlin.random.Random



fun stressTestGcd(naive: (a: Int, b: Int) -> Int, mine: (c: Int, d: Int) -> Int) {
    do {
        var f = (0..4000000).random()
        var s = (0..4000000).random()
        println("$f $s")
        var tn = naive(f, s)
        var tm = mine(f, s)

    } while (tn == tm)

}

fun stressTestLcm(naive: (a: Int, b: Int) -> Long, mine: (c: Int, d: Int) -> Long) {
    do {
        var f = (0..400000).random()
        var s = (0..400000).random()
        println("$f $s")
        var tn = naive(f, s)
        var tm = mine(f, s)

    } while (tn == tm)

}

fun stressTestFibonacciSumLastDigit(naive: (a: Long) -> Long, mine: (c: Long) -> Long) {
    var i = 1L
    do {

        var tn = naive(i)
        var tm = mine(i)
        i++
        println("naive: $tn \t fast: $tm \t n: $i")

    } while (tn == tm)

}