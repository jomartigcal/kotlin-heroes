import kotlin.math.pow

//  6A
//  https://codeforces.com/contest/1488/problem/A

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    repeat(readInt()) {
        val (x, y) = readInts()
        computeK(x, y)
    }
}

fun computeK(x: Int, y: Int) {
    var k = 0
    var yVar = y
    val yDigits = y.toString().length

    for (i in yDigits - 1 downTo 0) {
        val diff = (x * 10.toDouble().pow(i)).toInt()
        if (diff in 1..yVar) {
            val out = yVar / diff
            yVar -= out * diff
            k += out
        }
    }

    if (yVar > 0) {
        val output = yVar / x
        yVar -= x * output
        k += output
    }

    k += yVar

    println(k)
}
