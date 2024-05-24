package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.PriorityQueue

private var isVisit = mutableListOf<Int>()
private var linkMap = mutableListOf(PriorityQueue<Int>())
private var cnt = 1

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M, R) = readLine().split(' ').map { it.toInt() }
    isVisit = MutableList(N + 1) { 0 }
    linkMap = MutableList(N + 1) { PriorityQueue<Int>() }

    for (i in 1..M) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        linkMap[a].add(b)
        linkMap[b].add(a)
    }
    dfs(N, R)

    val bw = BufferedWriter(System.out.bufferedWriter())
    for (i in 1..N) {
        bw.write("${isVisit[i]}\n")
    }
    bw.flush()
    bw.close()
}

private fun dfs(n:Int, v: Int) {
    isVisit[v] = cnt++

    while (linkMap[v].isNotEmpty()) {
        val cur = linkMap[v].poll()
        if (isVisit[cur] == 0) {
            dfs(n, cur)
        }
    }
}