//  12A: Easy Problem
//  https://codeforces.com/contest/2088/problem/A

private fun readInt() = readln().toInt()

fun main() {
    repeat(readInt()) {
        countAddends(readInt())
    }
}

private fun countAddends(sum: Int) {
    var count = 0
    for (x in 1..sum) {
        for (y in 1..sum) {
            if (x + y == sum) count++
        }
    }

    println(count)
}
