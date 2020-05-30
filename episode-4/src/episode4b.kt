//  Episode 4B
//  https://codeforces.com/contest/1346/problem/B

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val lines = readInt()
    repeat(lines) {
        val (n, k1, k2) = readInts()
        val days = readLn().toCharArray()
        getMaximumM(k1, k2, days)
    }
}

fun getMaximumM(k1: Int, k2: Int, days: CharArray) {
    var maximum = 0

    var previous = 0
    for ((index, value) in days.withIndex()) {
        if (value == '1') {
            if (previous + k1 > k2) {
                maximum += k2 - k1
                previous = k2 - k1
            } else {
                maximum += k1
                previous = k1
            }

        } else {
            previous = 0
        }
    }

    println(maximum)
}
