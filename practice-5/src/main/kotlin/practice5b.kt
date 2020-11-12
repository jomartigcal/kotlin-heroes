//  Candies and Two Sisters
//  https://codeforces.com/contest/1432/problem/B

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val lines = readInt()
    for (line in 1..lines) {
        shareCandies(readInt())
    }
}

fun shareCandies(candies: Int) {
    when {
        candies < 3 -> {
            println("0")
        }
        candies % 2 == 0 -> {
            println(candies / 2 - 1)
        }
        else -> {
            println(candies / 2)
        }
    }
}
