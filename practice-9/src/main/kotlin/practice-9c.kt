//  9C
//  https://codeforces.com/contest/1645/problem/C

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    formTeams(readInt(), readInts())
}

fun formTeams(total: Int, students: List<Int>) {
    println(students.sorted().chunked(2).sumOf {
        it.last() - it.first()
    })
}
