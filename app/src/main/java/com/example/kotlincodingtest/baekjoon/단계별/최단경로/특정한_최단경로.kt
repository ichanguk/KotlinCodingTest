package com.example.kotlincodingtest.baekjoon.단계별.최단경로

import java.io.BufferedReader
import java.util.LinkedList
import java.util.PriorityQueue

private val INF = Int.MAX_VALUE
private var dist = mutableListOf<Long>()
private var dist2 = mutableListOf<Long>()
private var dist3 = mutableListOf<Long>()
private var linkList = mutableListOf<LinkedList<Pair<Int, Int>>>()


fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, E) = readLine().split(' ').map { it.toInt() }
    linkList = MutableList(N + 1) { LinkedList<Pair<Int, Int>>() }
    dist = MutableList(N + 1) { INF.toLong() }
    dist2 = MutableList(N + 1) { INF.toLong() }
    dist3 = MutableList(N + 1) { INF.toLong() }


    repeat(E) {
        val (a, b, c) = readLine().split(' ').map { it.toInt() }
        linkList[a].add(Pair(b, c))
        linkList[b].add(Pair(a, c))
    }
    val (v1, v2) = readLine().split(' ').map { it.toInt() }

    dijkstra(1, dist)
    dijkstra(v1, dist2)
    dijkstra(v2, dist3)

    var res:Long
    res = minOf(dist[v1] + dist2[v2] + dist3[N], dist[v2] + dist2[v2] + dist2[N])
    if (res >= INF) {
        println(-1)
    } else {
        println(res)
    }

}

fun dijkstra(start:Int, d:MutableList<Long>) {
    val q = PriorityQueue<Pair<Int, Int>>(compareBy { it.first })
    q.add(Pair(0, start))
    d[start] = 0

    while (q.isNotEmpty()) {
        val cur = q.remove()

        if (cur.first > d[cur.second]) {
            continue
        }

        for (l in linkList[cur.second]) {
            if (l.second + cur.first < d[l.first]) {
                d[l.first] = (l.second + cur.first).toLong()
                q.add(Pair(d[l.first].toInt(), l.first))
            }
        }
    }
}