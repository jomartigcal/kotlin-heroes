//  Polycarp and the Language of Gods
//  https://codeforces.com/contest/1431/problem/B

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val lines = readInt()
    for (line in 1..lines) {
        val vw = readLn()
        underline(vw)
    }
}

fun underline(vw: String) {
    val w = vw.count { it == 'w' }
    val vv = "vv"
    val v = vw.split(vv).size - 1
    println(v + w)
}
