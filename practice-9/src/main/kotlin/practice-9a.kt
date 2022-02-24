//  9A
//  https://codeforces.com/contest/1645/problem/A

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    repeat(readInt()) {
        val length = readInt()
        val numbers = readInts()
        println(indexOfUniqueNumberFrom(numbers))
    }
}

fun indexOfUniqueNumberFrom(numbers: List<Int>): Int {
    val counts = numbers.groupingBy { it }.eachCount()
    val unique = counts.filterValues { it == 1 }.keys.first()
    return numbers.indexOf(unique) + 1
}
