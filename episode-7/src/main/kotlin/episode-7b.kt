//  7B
//  https://codeforces.com/contest/1533/problem/B

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readLongs() = readStrings().map { it.toLong() }

fun main() {
    repeat(readInt()) { //t
        val n = readInt()
        val list = readLongs()
        val diff = list.zipWithNext { a, b -> b - a }
        val even = diff.count { it % 2 == 0L }
        if (even > 0) println("YES") else println("NO")
    }
}
