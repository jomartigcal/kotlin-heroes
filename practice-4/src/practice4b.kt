//  Square?
//  https://codeforces.com/contest/1347/problem/B

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val lines = readInt()
    for (line in 1..lines) {
        val dimensA = readInts()
        val dimensB = readInts()
        println(isASquare(dimensA, dimensB))
    }
}

fun isASquare(dimensA: List<Int>, dimensB: List<Int>): String {
    return if (dimensA.max() == dimensB.max() && dimensA.min()?.plus(dimensB.min() ?: 0)  == dimensA.max()) {
        "yes"
    } else {
        "no"
    }
}
