//  6D
//  https://codeforces.com/contest/1489/problem/D

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()

fun main() {
    val strings = mutableListOf<String>()
    repeat(readInt()) {
        strings.add(readLn())
    }
    sortSubstring(strings.sortedBy { it.length })
}

fun sortSubstring(strings: List<String>) {
    var sortable = true
    for (i in 0..strings.size - 2) {
        if (!strings[i + 1].contains(strings[i])) {
            sortable = false
            break
        }
    }
    if (sortable) {
        println("YES")
        strings.forEach { println(it) }
    } else {
        println("NO")
    }
}
