//  6B
//  https://codeforces.com/contest/1489/problem/B

import java.lang.Long.min

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readLongs() = readStrings().map { it.toLong() }

fun main() {
    repeat(readInt()) {
        val (number, bottleA, bottleB) = readLongs()
        buyWater(number, bottleA, bottleB)
    }
}

fun buyWater(number: Long, bottleA: Long, bottleB: Long) {
    val a = number * bottleA
    val num2 = number / 2
    val allB = (num2 * bottleB)

    var b = allB
    if (number != 2L && number > num2 * 2) {
        val remaining = number - num2 * 2
        b = allB + remaining * bottleA
    }
    println(min(a, b))
}