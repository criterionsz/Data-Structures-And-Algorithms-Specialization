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