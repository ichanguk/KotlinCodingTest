package com.example.kotlincodingtest.baekjoon.단계별.스택_큐_덱

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.ArrayDeque

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val d = ArrayDeque<Int>()
    val bw = BufferedWriter(System.out.bufferedWriter())

    for (i in 1..N) {
        val command = readLine().split(' ')
        when(command[0]) {
            "1" -> d.addFirst(command[1].toInt())
            "2" -> d.add(command[1].toInt())
            "3" -> bw.write(if (d.isEmpty()) "-1\n" else "${d.removeFirst()}\n")
            "4" -> bw.write(if (d.isEmpty()) "-1\n" else "${d.removeLast()}\n")
            "5" -> bw.write("${d.size}\n")
            "6" -> bw.write(if (d.isEmpty()) "1\n" else "0\n")
            "7" -> bw.write(if (d.isEmpty()) "-1\n" else "${d.first}\n")
            "8" -> bw.write(if (d.isEmpty()) "-1\n" else "${d.last}\n")
        }
    }
    bw.flush()
    bw.close()
}