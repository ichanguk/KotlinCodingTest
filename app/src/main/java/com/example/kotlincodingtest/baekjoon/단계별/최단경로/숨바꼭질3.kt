package com.example.kotlincodingtest.baekjoon.단계별.최단경로

import java.io.BufferedReader
import java.util.PriorityQueue

private val INF = Int.MAX_VALUE

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, K) = readLine().split(' ').map { it.toInt() }
    val q = PriorityQueue<Pair<Int, Int>>(compareBy { it.first })
    q.add(Pair(0, N))

    val dist = MutableList(100001) { INF }
    dist[N] = 0
    while (q.isNotEmpty()) {
        val cur = q.remove()

        if (cur.first > dist[cur.second]) {
            continue
        }

        val nextCur = mutableListOf(Pair(cur.second - 1, 1), Pair(cur.second + 1, 1), Pair(cur.second * 2, 0))
        for (i in 0 until 3) {
            if (nextCur[i].first in 0..100000 && cur.first + nextCur[i].second < dist[nextCur[i].first]) {
                dist[nextCur[i].first] = cur.first + nextCur[i].second
                q.add(Pair(nextCur[i].second + cur.first , nextCur[i].first))
            }
        }
    }

    println(dist[K])
}