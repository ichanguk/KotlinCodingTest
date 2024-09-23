package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (m, n) = readLine().split(' ').map { it.toInt() }
    val g = MutableList(m + 1) { mutableListOf<Int>() }

    repeat(n) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        g[a].add(b)
        g[b].add(a)
    }

    val q = readLine().toInt()

    repeat(q) {
        val (cmd, a, b) = readLine().split(' ').map { it.toInt() }

        if (cmd == 1) {
            g[a].add(b)
            g[b].add(a)
        } else {
            g[a].remove(b)
            g[b].remove(a)
        }
        bfs(g)
    }
}

private fun bfs(g: MutableList<MutableList<Int>>) {
    val q = ArrayDeque<Pair<Int,Int>>()
    q.addLast(Pair(1, 0))
    val dist = IntArray(g.size) { -1 }
    val isVisit = BooleanArray(g.size) { false }
    isVisit[1] = true

    while (q.isNotEmpty()) {
        val (cur, d) = q.removeFirst()

        dist[cur] = d

        for (n in g[cur]) {
            if (!isVisit[n]) {
                q.addLast(Pair(n, d + 1))
                isVisit[n] = true
            }
        }
    }

    dist.drop(1).forEach {
        print("$it ")
    }
    println()
}