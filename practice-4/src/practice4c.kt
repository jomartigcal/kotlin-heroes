//  Sum of Round Numbers
//  https://codeforces.com/contest/1347/problem/C

import kotlin.math.*

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")

fun main() {
    val lines = readInt()
    for (line in 1..lines) {
        val number = readLn()
        val roundNumbers = unRound(number)
        println(roundNumbers.size)
        println(roundNumbers.joinToString(" "))
    }
}

fun unRound(numberString: String): MutableList<Int> {
    val roundNumbers = mutableListOf<Int>()
    var number = numberString.toInt()
    val digits = numberString.map { it.toString().toInt() }

    for ((index, value) in digits.withIndex()) {
        val roundNumber =  value * 10.0.pow(numberString.length-index-1).toInt()
        number-= roundNumber
        if (roundNumber != 0) {
            roundNumbers.add(roundNumber)
        }
    }

    return roundNumbers
}
