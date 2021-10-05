import kotlin.math.max

//  8E
//  https://codeforces.com/contest/1570/problem/E

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()

fun main() {
    repeat(readInt()) {
        println(getZeroesToRemove(readLn()))
    }
}

fun getZeroesToRemove(input: String): Int {
    var zeroes = 0

    val first = input.indexOf("1")
    val last = input.lastIndexOf("1")
    if (first == last) {
        return 0
    }

    val list = input.toList()
    for (i in first..last) {
        if (list[i] == '0') zeroes++
    }

    return zeroes
}
