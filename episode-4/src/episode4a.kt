//  Episode 4A
//  https://codeforces.com/contest/1346/problem/A

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val lines = readInt()
    repeat(lines) {
        val (n, k) = readInts()
        getNumbers(n, k)
    }
}

fun getNumbers(n: Int, k: Int) {
    val number1 = getFirstNumber(n, k)
    println("$number1 ${number1 * k} ${number1 * k * k} ${number1 * k * k * k}")
}

fun getFirstNumber(n: Int, k: Int): Int {
    val n2k = k * k
    val n3k = k * k * k
    val sum = 1 + k + n2k + n3k
    return n / sum
}
