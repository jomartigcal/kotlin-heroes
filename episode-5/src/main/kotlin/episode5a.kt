//  Selling Hamburgers
//  https://codeforces.com/contest/1431/problem/A

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
private fun readLongs() = readStrings().map { it.toLong() }

fun main() {
    val lines = readInt()
    for (line in 1..lines) {
        val cases = readInt()
        sellBurgers(readLongs())
    }
}

fun sellBurgers(customers: List<Long>) {
    val sorted = customers.sorted().reversed()
    val max = customers.maxOrNull()

    var best: Long = max!!
    sorted.forEachIndexed { i, c ->
        val cost = (i + 1) * c
        if (cost > best) best = cost

    }
    println(best)
}
