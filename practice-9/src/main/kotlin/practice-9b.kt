//  9B
//  https://codeforces.com/contest/1645/problem/B

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()

fun main() {
    decrypt(readInt(), readLn())
}

private fun decrypt(n: Int, t: String) {
    var x = 1
    var y = 2
    while (x <= n) {
        print(t[x - 1])
        x += y
        y++
    }
}
