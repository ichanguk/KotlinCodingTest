package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.PriorityQueue

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M, R) = readLine().split(' ').map { it.toInt() }
    val linkMap = MutableList(N + 1) { PriorityQueue<Int>(compareByDescending { it }) }

    for (i in 1..M) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        linkMap[a].add(b)
        linkMap[b].add(a)
    }

    val q = ArrayDeque<Int>()
    q.addLast(R)
    val isVisit = MutableList(N + 1) { 0 }
    var cnt = 1
    isVisit[R] = cnt++
    while (q.isNotEmpty()) {
        val cur = q.removeFirst()
        while (linkMap[cur].isNotEmpty()) {
            val nc = linkMap[cur].remove()
            if (isVisit[nc] == 0) {
                q.addLast(nc)
                isVisit[nc] = cnt++
            }
        }

    }

    val bw = BufferedWriter(System.out.bufferedWriter())

    for (i in 1..N) {
        bw.write("${isVisit[i]}\n")
    }
    bw.flush()
    bw.close()
}