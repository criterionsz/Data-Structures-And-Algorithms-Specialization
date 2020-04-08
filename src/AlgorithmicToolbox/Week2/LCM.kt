import java.util.*

fun lcmNaive(a: Int, b: Int): Long {
    for (l in 1..a.toLong() * b)
        if (l % a == 0L && l % b == 0L)
            return l

    return a.toLong() * b
}

fun lcmFast(a: Int, b: Int): Long{
    var c  = a
    var d  = b
    while(c!=d){
        if(c>d)
            c -= d
        else
            d -= c

    }
    return (a.toLong()*b)/d
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    //stressTestLcm(::lcmNaive, ::lcmFast)
    println(lcmFast(a, b))
}