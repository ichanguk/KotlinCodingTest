package com.example.kotlincodingtest.baekjoon.단계별.트리

import java.io.BufferedReader
import java.util.PriorityQueue
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val g = MutableList(n + 1) { mutableListOf<Pair<Int, Int>>() }

    var st: StringTokenizer
    repeat(n) {
        st = StringTokenizer(readLine())

        val v = st.nextToken().toInt()
        while (true) {
            val a = st.nextToken().toInt()
            if (a == -1) {
                break
            }
            val d = st.nextToken().toInt()
            g[v].add(Pair(a, d))
            g[a].add(Pair(v, d))
        }
    }

    val (u, _) = bfs(1, n, g)
    val (_, ans) = bfs(u, n, g)

    println(ans)
}

private fun bfs(s: Int, n: Int, g: MutableList<MutableList<Pair<Int, Int>>>): IntArray {
    val dist = IntArray(n + 1) { 1_000_000_001 }
    val q = PriorityQueue<Pair<Int, Int>>(compareBy { it.first })

    var maxDist = 0
    var maxN = s
    q.add(Pair(0, s))
    dist[s] = 0

    while (q.isNotEmpty()) {
        val (d, v) = q.remove()

        if (d > maxDist) {
            maxDist = d
            maxN = v
        }

        if (d > dist[v]) {
            continue
        }

        for (node in g[v]) {
            if (d + node.second < dist[node.first]) {
                dist[node.first] = d + node.second
                q.add(Pair(dist[node.first], node.first))
            }
        }
    }

    return intArrayOf(maxN, maxDist)
}
