//  6E
//  https://codeforces.com/contest/1489/problem/E

import java.lang.Integer.min
import kotlin.math.abs

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")

fun main() {
    val taskList = mutableListOf<Pair<Char, Int>>()
    repeat(readInt()) {
        val (task, bookId) = readStrings()
        taskList.add(task.single() to bookId.toInt())
    }
    queryBook(taskList)
}

fun queryBook(tasks: List<Pair<Char, Int>>) {
    val array = Array(200_001) { Integer.MIN_VALUE }

    var head = 0
    var tail = 0

    tasks.forEachIndexed { index, task ->
        if (index == 0) {
            array[task.second] = 0
            head--
            tail++
        } else {
            when (task.first) {
                'L' -> {
                    array[task.second] = head
                    head--
                }
                'R' -> {
                    array[task.second] = tail
                    tail++
                }
                else -> {    //?
                    val headIndex = abs(array[task.second] - head)
                    val tailIndex = abs(array[task.second] - tail)

                    println(min(headIndex - 1, tailIndex - 1))
                }
            }
        }

    }
}
