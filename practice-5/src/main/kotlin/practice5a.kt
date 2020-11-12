//  A+B (Trial Problem)
//  https://codeforces.com/contest/1432/problem/A

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val lines = readInt()
    for (line in 1..lines) {
        val numbers = readInts()
        println(numbers[0] + numbers[1])
    }
}
