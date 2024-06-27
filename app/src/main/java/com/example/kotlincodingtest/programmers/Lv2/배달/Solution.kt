package com.example.kotlincodingtest.programmers.Lv2.배달

import java.util.*

val INF = Int.MAX_VALUE

class Solution {
    fun solution(N: Int, road: Array<IntArray>, k: Int): Int {
        val g = MutableList(N + 1){ LinkedList<Pair<Int, Int>>() }
        val dist = MutableList(N + 1) { INF }
        for (r in road) {
            g[r[0]].add(Pair(r[1], r[2]))
            g[r[1]].add(Pair(r[0], r[2]))
        }

        val pq = PriorityQueue<Pair<Int, Int>>(compareBy{it.first})
        pq.add(Pair(0, 1))
        dist[1] = 0
        var nextCost:Int
        var nextPos:Int

        while (pq.isNotEmpty()) {
            val cur = pq.remove()

            if (dist[cur.second] < cur.first) {
                continue
            }

            for (l in g[cur.second]) {
                nextPos = l.first
                nextCost = l.second + cur.first
                if (nextCost < dist[nextPos]) {
                    dist[nextPos] = nextCost
                    pq.add(Pair(nextCost, nextPos))
                }
            }
        }


        return dist.filter{it <= k}.size
    }
}