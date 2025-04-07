//  12A: Password Generator
//  https://codeforces.com/contest/2087/problem/A

private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ")
private fun readIntegers() = readStrings().map { it.toInt() }

fun main() {
    repeat(readInt()) {
        val (a, b, c) = readIntegers()
        generatePassword(a, b, c)
    }
}

private fun generatePassword(a: Int, b: Int, c: Int) {
    val digits = (0..10).toList()
    val upperCaseLetters = ('A'..'Z').toList()
    val lowerCaseLetters = ('a'..'z').toList()
    val password = buildString {
        digits.take(a).forEach { append(it) }
        upperCaseLetters.take(b).forEach { append(it) }
        lowerCaseLetters.take(c).forEach { append(it) }
    }
    println(password)
}
