//  Special Permutation
//  https://codeforces.com/contest/1347/problem/E

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val lines = readInt()
    for (line in 1..lines) {
        val number = readInt()
        if (number < 4) {
            println("-1")
        } else {
            println(getPermutation(number).joinToString(" "))
        }
    }
}

fun getPermutation(number: Int): List<Int> {
    val permutations = mutableSetOf<Int>()
    val numbers = (1..number).map { it } as MutableList


    val evens = numbers.filter { it % 2 == 0}

    permutations.addAll(evens)

    val odds = numbers.filter { it % 2 != 0}.reversed()

    permutations.add(evens.last()-3)

    permutations.addAll(odds)

    return permutations.toList()
}
