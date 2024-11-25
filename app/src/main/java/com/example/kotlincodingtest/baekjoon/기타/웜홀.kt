package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val tc = readLine().toInt()
    repeat(tc) {
        val (n, m, w) = readLine().split(' ').map { it.toInt() }
        val g = mutableListOf<Pair<Int, Pair<Int, Int>>>()

        repeat(m) {
            val (s, e, t) = readLine().split(' ').map { it.toInt() }
            g.add(Pair(s, Pair(e, t)))
            g.add(Pair(e, Pair(s, t)))
        }

        repeat(w) {
            val (s, e, t) = readLine().split(' ').map { it.toInt() }
            g.add(Pair(s, Pair(e, t * (-1))))
        }

        if (bellmanFord(g, n)) {
            println("YES")
        } else {
            println("NO")
        }
    }
}

private fun bellmanFord(g: MutableList<Pair<Int, Pair<Int, Int>>>, n: Int): Boolean {
    val dist = IntArray(n + 1) { 0 }
    for (i in 1..n) {
        for (e in g) {
            val cur = e.first
            val (next, cost) = e.second

            if (dist[next] > dist[cur] + cost) {
                dist[next] = dist[cur] + cost
                if (i == n) {
                    return true
                }
            }
        }
    }
    return false
}
