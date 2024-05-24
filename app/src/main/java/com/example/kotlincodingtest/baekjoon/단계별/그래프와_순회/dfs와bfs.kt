package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.PriorityQueue

private var isVisit = mutableListOf<Boolean>()
private val bw = BufferedWriter(System.out.bufferedWriter())

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M, R) = readLine().split(' ').map { it.toInt() }
    val linkMap = MutableList(N + 1) { PriorityQueue<Int>() }
    for (i in 1..M) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        linkMap[a].add(b)
        linkMap[b].add(a)
    }

    val linkMap2 = MutableList(N + 1) { PriorityQueue<Int>() }
    for (i in 1..N) {
        linkMap[i].forEach {
            linkMap2[i].add(it)
        }
    }


    isVisit = MutableList(N + 1) { false }
    isVisit[R] = true
    dfs(R, linkMap2)
    bw.newLine()

    isVisit = MutableList(N + 1) { false }
    isVisit[R] = true
    bfs(R, linkMap)
    bw.newLine()
    bw.flush()
    bw.close()
}

private fun dfs(r: Int, m:MutableList<PriorityQueue<Int>>) {
    bw.write("$r ")
    while (m[r].isNotEmpty()) {
        val nr = m[r].remove()
        if (!isVisit[nr]) {
            isVisit[nr] = true
            dfs(nr, m)
        }
    }
}

private fun bfs(r: Int, m:MutableList<PriorityQueue<Int>>) {
    val q = ArrayDeque<Int>()
    q.addLast(r)
    bw.write("$r ")
    while (q.isNotEmpty()) {
        val cur = q.removeFirst()
        while (m[cur].isNotEmpty()) {
            val nc = m[cur].remove()
            if (!isVisit[nc]) {
                bw.write("$nc ")
                isVisit[nc] = true
                q.addLast(nc)
            }

        }
    }
}