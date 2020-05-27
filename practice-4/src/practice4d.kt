//  Alice, Bob and Candies
//  https://codeforces.com/contest/1347/problem/D

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

fun main() {
    val lines = readInt()
    for (line in 1..lines) {
        val numberOfCandies = readInt()
        playCandyGame(readInts() as MutableList)
    }
}

fun playCandyGame(candies: MutableList<Int>) {
    var alice = 0
    var bob = 0
    var moves = 0

    var previouslyEaten = 0
    while (candies.isNotEmpty()) {
        var aliceEats = 0
        while (aliceEats <= previouslyEaten && candies.isNotEmpty()) {
            aliceEats += candies.first()
            candies.remove(candies.first())
        }
        if (aliceEats > 0) {
            previouslyEaten = aliceEats
            alice += aliceEats
            moves++
        }

        var bobEats = 0
        while (bobEats <= previouslyEaten && candies.isNotEmpty()) {
            if (candies.isNotEmpty()) {
                bobEats += candies.last()
                candies.removeAt(candies.size - 1)
            }
        }
        if (bobEats > 0) {
            previouslyEaten = bobEats
            bob += bobEats
            moves++
        }
    }
    println("$moves $alice $bob")
}
