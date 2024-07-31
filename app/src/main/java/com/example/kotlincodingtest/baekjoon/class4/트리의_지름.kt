package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader

private var N = 0
private var answer = 0
private var answerPoint = 0


fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    N = readLine().toInt()

    val g = MutableList(N + 1) { mutableListOf<Pair<Int, Int>>() }

    repeat(N - 1) {
        val (a, b, d) = readLine().split(' ').map { it.toInt() }
        g[a].add(Pair(b, d))
        g[b].add(Pair(a, d))
    }

    bfs(g, 1)
    bfs(g, answerPoint)
    println(answer)
}

private fun bfs(g: MutableList<MutableList<Pair<Int, Int>>>, s: Int) {
    val isVisit = MutableList(N + 1) { false }
    val dq = ArrayDeque<Pair<Int, Int>>()
    dq.addLast(Pair(s, 0))
    isVisit[s] = true

    while (dq.isNotEmpty()) {
        val cur = dq.removeFirst()
        if (cur.second > answer) {
            answer = cur.second
            answerPoint = cur.first
        }

        for (n in g[cur.first]) {
            if (!isVisit[n.first]) {
                isVisit[n.first] = true
                dq.addLast(Pair(n.first, cur.second + n.second))
            }
        }
    }
}