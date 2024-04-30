package com.example.kotlincodingtest.baekjoon.단계별.스택_큐_덱

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.ArrayDeque
import java.util.Deque

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val q:Deque<Int> = ArrayDeque()
    val bw = BufferedWriter(System.out.bufferedWriter())

    for (i in 1..N) {
        val command = readLine().split(' ')
        when(command[0]) {
            "push" -> q.add(command[1].toInt())
            "pop" -> bw.write(if (q.isEmpty()) { "-1\n" } else { "${q.removeFirst()}\n" })
            "size" -> bw.write("${q.size}\n")
            "empty" -> bw.write(if (q.isEmpty()) "1\n" else "0\n")
            "front" -> bw.write(if (q.isEmpty()) "-1\n" else "${q.first}\n")
            "back" -> bw.write(if (q.isEmpty()) "-1\n" else "${q.last}\n")
        }
    }
    bw.flush()
    bw.close()
}