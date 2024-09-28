package com.example.kotlincodingtest.programmers.Lv3.가장_먼_노드

import java.util.*

const val INF = Integer.MAX_VALUE
class Solution {
    fun solution(n: Int, edge: Array<IntArray>): Int {
        var answer = 0
        val g = Array(n + 1) { mutableListOf<Int>() }

        edge.forEach { (a, b) ->
            g[a].add(b)
            g[b].add(a)
        }

        val pq = PriorityQueue<Pair<Int, Int>>(compareBy{it.second})
        pq.add(Pair(1, 0))

        val dist = IntArray(n + 1) { INF }
        dist[1] = 0

        while (pq.isNotEmpty()) {
            val (cur, d) = pq.remove()

            if (d > dist[cur]) {
                continue
            }

            for (n in g[cur]) {
                if (d + 1 < dist[n]) {
                    dist[n] = d + 1
                    pq.add(Pair(n, d + 1))
                }
            }
        }

        val maxDist = dist.filter{ it != INF }.maxOrNull()

        answer = dist.count{ it == maxDist }

        return answer
    }
}