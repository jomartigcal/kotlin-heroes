//  Equalize Prices Again
//  https://codeforces.com/contest/1432/problem/C

import kotlin.math.ceil
import kotlin.math.roundToInt

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
   val lines = readInt()
    for (line in 1..lines) {
        val numberOfGoods = readInt()
        equalizePrices(readInts())
    }
}

fun equalizePrices(prices: List<Int>) {
    println(ceil(prices.average()).toInt())
}
