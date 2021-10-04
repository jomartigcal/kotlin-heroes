//  8D
//  https://codeforces.com/contest/1570/problem/D

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()

fun main() {
    var number = readInt()

    val reachableNumbers = mutableListOf<Int>()
    while (number !in reachableNumbers) {
        reachableNumbers.add(number)
        number = addOneThenRemoveZeroes(number)
    }

    println(reachableNumbers.size)
}

fun addOneThenRemoveZeroes(input: Int): Int {
    var number = input + 1
    while (number % 10 == 0) {
        number /= 10
    }
    return number
}
