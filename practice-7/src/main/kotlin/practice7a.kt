//  7A
//  https://codeforces.com/contest/1532/problem/A

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    repeat(readInt()) {
        val numbers = readInts()
        println(numbers[0] + numbers[1])
    }
}
