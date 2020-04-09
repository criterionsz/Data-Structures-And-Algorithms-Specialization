import java.util.*


fun getOptimalValue(capacity: Int, values: IntArray, weights: IntArray): Double {
    val itemValue: Array<Item?> = arrayOfNulls(weights.size)
    for (i in weights.indices) {
        itemValue[i] = Item(weights[i], values[i], i)
    }
    itemValue.sortByDescending { it?.unit }

    var totalValue = 0.0
    var c = capacity

    for (i in itemValue) {
        val curW = i!!.w
        val curV = i.v
        if (c - curW >= 0) {
            c -= curW
            totalValue += curV
        } else {
            val f = c / curW.toDouble()
            totalValue += curV * f
            c = (c - curW * f).toInt()
            break
        }
    }

    return Math.round(totalValue * 10000.0) / 10000.0
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val capacity = scanner.nextInt()
    val values = IntArray(n)
    val weights = IntArray(n)
    for (i in 0 until n) {
        values[i] = scanner.nextInt()
        weights[i] = scanner.nextInt()
    }
    println(getOptimalValue(capacity, values, weights))
}

data class Item(var w: Int, var v: Int, var i: Int){
    var unit: Double = v*1.0/w
}