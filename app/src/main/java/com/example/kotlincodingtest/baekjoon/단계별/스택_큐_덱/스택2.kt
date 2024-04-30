package com.example.kotlincodingtest.baekjoon.단계별.스택_큐_덱

import java.io.BufferedReader
import java.io.BufferedWriter

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val stackList = mutableListOf<Int>()
    val bw = BufferedWriter(System.out.bufferedWriter())

    var command: String? = null
    for (i in 1..N) {
        command = readLine()
        when (command[0]) {
            '1' -> stackList.add(command.split(' ')[1].toInt())
            '2' -> if (stackList.isEmpty()) {
                bw.write("-1\n")
            } else {
                bw.write("${stackList[stackList.size - 1]}\n")
                stackList.removeAt(stackList.size - 1)
            }
            '3' -> bw.write("${stackList.size}\n")
            '4' -> if (stackList.isEmpty()) {
                bw.write("1\n")
            } else {
                bw.write("0\n")
            }
            '5' -> if (stackList.isEmpty()) {
                bw.write("-1\n")
            } else {
                bw.write("${stackList[stackList.size - 1]}\n")
            }
        }
    }
    bw.flush()
    bw.close()
}

