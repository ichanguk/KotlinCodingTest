package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val m = readLine().toInt()
    val g = MutableList(n + 1) { mutableListOf<Int>() }

    repeat(m) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        g[a].add(b)
        g[b].add(a)
    }

    var ans = g[1].size

    val isVisit = BooleanArray(n + 1) { false }
    isVisit[1] = true

    val q = ArrayDeque<Int>()
    g[1].forEach {
        q.addLast(it)
        isVisit[it] = true
    }

    while (q.isNotEmpty()) {
        val cur = q.removeFirst()

        g[cur].forEach {
            if (!isVisit[it]) {
                ans++
                isVisit[it] = true
            }
        }
    }

    println(ans)
}