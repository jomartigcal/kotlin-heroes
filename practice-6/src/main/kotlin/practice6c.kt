//  6C
//  https://codeforces.com/contest/1489/problem/C

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()

fun main() {
    val count = readInt()
    val string = readLn()
    checkFileName(string)
}

fun checkFileName(fileName: String) {
    var varFileName = fileName
    var count = 0
    while (varFileName.contains("xxx")) {
        varFileName = varFileName.replaceFirst("xxx", "xx")
        count++
    }
    println(count)
}
