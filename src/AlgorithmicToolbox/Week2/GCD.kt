import AlgorithmicToolbox.stressTestGcd
import java.util.*
import kotlin.random.Random

fun gcdNaive(a: Int, b: Int): Int {
    var currentGcd = 1
    var d = 2
    while (d <= a && d <= b) {
        if (a % d == 0 && b % d == 0) {
            if (d > currentGcd) {
                currentGcd = d
            }
        }
        ++d
    }

    return currentGcd
}

fun gcdFast(a: Int, b: Int): Int{
    var c = a
    var d = b
    while(c!=d){
        if(c>d)
            c -= d
        else
            d -= c

    }
    return d
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    //stressTestGcd(::gcdNaive, ::gcdFast)
    println(gcdFast(a, b))
}