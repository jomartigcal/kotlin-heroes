//  10A
//  https://codeforces.com/contest/1959/problem/A

private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    repeat(readInt()) {
        readInt()
        findIndexOfUniqueFrom(readInts())
    }
}

private fun findIndexOfUniqueFrom(numbers: List<Int>) {
    val unique = numbers.groupingBy { it }.eachCount().filterValues { it == 1 }.keys.first()
    println(numbers.indexOf(unique) + 1)
}
