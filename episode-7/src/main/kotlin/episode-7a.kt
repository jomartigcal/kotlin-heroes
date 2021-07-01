//  7A
//  https://codeforces.com/contest/1533/problem/A

import kotlin.math.max

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    repeat(readInt()) {
        val (n, k) = readInts()
        checkTravel(n, k)
    }
}

fun checkTravel(n: Int, k: Int) {
    var days = 0
    repeat(n) {
        val (start, end) = readInts()
        if (k >= start) {
            val x = (k..end).count()
            days = max(days, x)
        }
    }

    println(days)
}
