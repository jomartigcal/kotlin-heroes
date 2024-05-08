//  10B: https://codeforces.com/contest/1959/problem/B

private fun readInt() = readln().toInt()
private fun readStrings() = readln().split(" ")

private enum class ShirtSizeCode { S, M, L, INVALID }

private data class ShirtSize(val size: ShirtSizeCode, val x: Int) {
    operator fun compareTo(shirt2: ShirtSize): Int {
        if (this.size != shirt2.size) return this.size.ordinal.compareTo(shirt2.size.ordinal)
        if (this.size == ShirtSizeCode.S) return shirt2.x.compareTo(this.x)
        if (this.size == ShirtSizeCode.L) return this.x.compareTo(shirt2.x)
        return 0
    }
}

private fun Char.toShirtSizeCode(): ShirtSizeCode {
    return when (this) {
        'S' -> ShirtSizeCode.S
        'M' -> ShirtSizeCode.M
        'L' -> ShirtSizeCode.L
        else -> ShirtSizeCode.INVALID
    }
}

private fun String.toShirtSize(): ShirtSize {
    return ShirtSize(this.last().toShirtSizeCode(), this.toList().dropLast(1).size)
}

fun main() {
    repeat(readInt()) {
        val (shirt1, shirt2) = readStrings().map { it.toShirtSize() }
        if (shirt1 < shirt2) {
            println("<")
        } else if (shirt1 > shirt2) {
            println(">")
        } else {
            println("=")
        }
    }
}