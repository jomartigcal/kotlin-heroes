//  Black Friday
//  https://codeforces.com/contest/1431/problem/C

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val lines = readInt()
    for (line in 1..lines) {
        val (n,discount) = readInts()
        val items = readInts()
        computeMax(items, discount)
    }
}

fun computeMax(items: List<Int>, disc: Int) {
    var max = 0
    for (i in disc..items.size) {
        val discounted = i / disc
        val purchase = items.takeLast(i)
        val discountedPurchase = purchase.take(discounted)
        val x = discountedPurchase.sum()

        if (x > max) {
            max = x
        }
    }
    println(max)
}
