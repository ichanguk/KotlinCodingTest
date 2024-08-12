package com.example.kotlincodingtest.baekjoon.단계별.최단경로

import java.io.BufferedReader
import java.util.PriorityQueue

private const val INF = 1_000_000_000

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()
    repeat(T) {
        val (v, e, t) = readLine().split(' ').map { it.toInt() }
        val (s, g, h) = readLine().split(' ').map { it.toInt() }
        val graph = MutableList(v + 1) { mutableListOf<Pair<Int, Int>>() }

        repeat(e) {
            val (a, b, c) = readLine().split(' ').map { it.toInt() }
            graph[a].add(Pair(b, c))
            graph[b].add(Pair(a, c))
        }
        val candSites = IntArray(t) { 0 }

        for (i in candSites.indices) {
            candSites[i] = readLine().toInt()
        }

        var dist1 = IntArray(v + 1) { INF }
        dijkstra(s, graph, dist1)
        var dist2 = IntArray(v + 1) { INF }
        var flag = true
        if (dist1[g] <= dist1[h]) {
            dijkstra(h, graph, dist2)
        } else {
            flag = false
            dijkstra(g, graph, dist2)
        }

        var cost = 0
        var answer = mutableListOf<Int>()
        for (c in candSites) {
            if (flag) {
                cost = dist1[g] + dist2[g] + dist2[c]
            } else {
                cost = dist1[h] + dist2[h] + dist2[c]
            }
            if (cost <= dist1[c]) {
                answer.add(c)
            }
        }

        answer.sorted().forEach {
            print("$it ")
        }
        println()

    }
}

private fun dijkstra(s: Int, g: MutableList<MutableList<Pair<Int, Int>>>, dist: IntArray) {
    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
    pq.add(Pair(s, 0))
    dist[s] = 0

    var nextCost:Int
    while (pq.isNotEmpty()) {
        val (cur, curCost) = pq.remove()

        if (dist[cur] < curCost) {
            continue
        }

        for (node in g[cur]) {
            nextCost = node.second + curCost
            if (nextCost < dist[node.first]) {
                dist[node.first] = nextCost
                pq.add(Pair(node.first, nextCost))
            }
        }
    }
}