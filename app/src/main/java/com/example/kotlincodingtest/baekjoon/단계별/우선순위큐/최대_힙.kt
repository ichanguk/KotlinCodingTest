package com.example.kotlincodingtest.baekjoon.단계별.우선순위큐

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.PriorityQueue

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val pq = PriorityQueue<Int>(compareByDescending { it })
    val N = readLine().toInt()
    var cmd:Int
    val bw = BufferedWriter(System.out.bufferedWriter())
    for (i in 1..N) {
        cmd = readLine().toInt()
        if (cmd == 0) {
            if (pq.isNotEmpty()) {
                bw.write("${pq.poll()}\n")
            } else {
                bw.write("0\n")
            }
        } else {
            pq.add(cmd)
        }
    }
    bw.flush()
    bw.close()
}