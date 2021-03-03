//  6A
//  https://codeforces.com/contest/1489/problem/A

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val num = readInt()
    removeDuplicates(readInts())
}

fun removeDuplicates(list: List<Int>) {
    val distinct = list.reversed().distinct()
    println(distinct.size)
    println(distinct.reversed().joinToString(" "))
}