//  Construct the String
//  https://codeforces.com/contest/1432/problem/D

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val lines = readInt()
    for (line in 1..lines) {
        constructStrings(readInts())
    }
}

fun constructStrings(integers: List<Int>) {
    val (n, a, b) = integers
    for (i in 0 until n) {
        print('a' + (i % b))
    }
    println()
}
