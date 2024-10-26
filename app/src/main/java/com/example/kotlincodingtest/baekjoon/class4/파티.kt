package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader
import java.util.PriorityQueue

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m, x) = readLine().split(' ').map { it.toInt() }
    val g = MutableList(2) { MutableList(n + 1) { mutableListOf<Pair<Int, Int>>() } }
    val dist = Array(2) { IntArray(n + 1) { 1_000_000 } }

    repeat(m) {
        val (a, b, c) = readLine().split(' ').map { it.toInt() }
        g[0][a].add(Pair(b, c))
        g[1][b].add(Pair(a, c))
    }

    dijkstra(0, g, dist, x)
    dijkstra(1, g, dist, x)

    var ans = 0
    for (i in 1..n) {
        ans = maxOf(ans, dist[0][i] + dist[1][i])
    }
    println(ans)
}

private fun dijkstra(
    k: Int,
    g: MutableList<MutableList<MutableList<Pair<Int, Int>>>>,
    dist: Array<IntArray>,
    x: Int
) {
    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
    pq.add(Pair(x, 0))
    dist[k][x] = 0

    var nextCost: Int
    while (pq.isNotEmpty()) {
        val (cur, curCost) = pq.remove()

        if (curCost > dist[k][cur]) {
            continue
        }

        for (node in g[k][cur]) {
            nextCost = curCost + node.second
            if (nextCost < dist[k][node.first]) {
                dist[k][node.first] = nextCost
                pq.add(Pair(node.first, nextCost))
            }
        }
    }

}