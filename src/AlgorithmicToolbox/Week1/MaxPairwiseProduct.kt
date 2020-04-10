package AlgorithmicToolbox.Week1

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun getMaxPairwiseProductFast(numbers: IntArray): Long {
    var max_index1 = -1
    var max_index2 = -1
    val n = numbers.size
    for (i in 0 until n)
        if (max_index1 == -1 || numbers[i] > numbers[max_index1])
            max_index1 = i

    for (j in 0 until n)
        if ( (max_index1 != j) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2])))
            max_index2 = j
    return numbers[max_index1].toLong()*numbers[max_index2].toLong()
}

fun main(args: Array<String>) {
    val scanner = FastScanner(System.`in`)
    val n = scanner.nextInt()
    val numbers = IntArray(n)
    for (i in 0 until n) {
        numbers[i] = scanner.nextInt()
    }
    println(getMaxPairwiseProductFast(numbers))
}

class FastScanner(stream: InputStream) {
    var br: BufferedReader = BufferedReader(InputStreamReader(stream))
    var st: StringTokenizer? = null

    fun next(): String {
        while (st == null || !st!!.hasMoreTokens()) {
            try {
                st = StringTokenizer(br.readLine())
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return st!!.nextToken()
    }

    fun nextInt() = next().toInt()
}