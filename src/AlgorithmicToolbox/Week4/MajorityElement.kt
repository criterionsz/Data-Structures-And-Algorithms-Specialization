
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs

fun getMajorityElement(a: LongArray, left: Int, right: Int): Int {
    if (left == right - 1) {
        return -1;
    }
    a.sort()
    var mid = (right) / 2
    var p = a[mid]
    var count = 0
    var i = mid - 1
    while (i >= left && a[i] == p) {
        count++
        if (count + 1 > mid)
            return 1
        i--
    }
    i = mid + 1
    while (i < right && a[i] == p) {
        count++
        if (count + 1 > mid)
            return 1
        i++
    }
    return -1
}


fun main(args: Array<String>) {
   //stressTestMajorityElement(::getMajorityElementNaive, ::getMajorityElement)
    val scanner = FastScannerME(System.`in`)
    val n = scanner.nextInt()
    val a = LongArray(n)
    for (i in 0 until n) {
        a[i] = scanner.nextLong()
    }
    if (getMajorityElement(a, 0, a.size) != -1) {
        println(1)
    } else {
        println(0)
    }
}

class FastScannerME(stream: InputStream) {
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
    fun nextLong() = next().toLong()
}