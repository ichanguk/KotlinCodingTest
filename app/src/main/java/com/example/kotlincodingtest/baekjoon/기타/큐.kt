package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.io.BufferedWriter

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()

    val q = ArrayDeque<Int>()
    val bw = BufferedWriter(System.out.bufferedWriter())
    for (i in 1..N) {
        val cmd = readLine().split(' ')
        when(cmd[0]) {
            "push" -> q.addLast(cmd[1].toInt())
            "pop" -> if (q.isEmpty()) bw.write("-1\n") else bw.write("${q.removeFirst()}\n")
            "size" -> bw.write("${q.size}\n")
            "empty" -> if (q.isEmpty()) bw.write("1\n") else bw.write("0\n")
            "front" -> if (q.isEmpty()) bw.write("-1\n") else bw.write("${q.first()}\n")
            "back" -> if (q.isEmpty()) bw.write("-1\n") else bw.write("${q.last()}\n")
        }
    }
    bw.flush()
    bw.close()
}