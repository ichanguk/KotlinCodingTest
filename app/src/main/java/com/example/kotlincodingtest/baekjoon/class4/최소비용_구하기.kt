package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader
import java.util.PriorityQueue

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val M  = readLine().toInt()

    val g = MutableList(N + 1) { mutableListOf<Pair<Int, Int>>() }
    val dist = MutableList(N + 1) { Int.MAX_VALUE }

    repeat(M) {
        val (a, b, c) = readLine().split(' ').map { it.toInt() }
        g[a].add(Pair(b, c))
    }

    val (s, e) = readLine().split(' ').map { it.toInt() }
    val pq = PriorityQueue<Pair<Int, Int>>(compareBy{it.first})
    pq.add(Pair(0, s))
    dist[s] = 0

    var nextCost:Int
    while (pq.isNotEmpty()) {
        val (curCost, curNode) = pq.remove()
        if (dist[curNode] < curCost) {
            continue
        }
        for (n in g[curNode]) {
            nextCost = curCost + n.second

            if (nextCost < dist[n.first]) {
                dist[n.first] = nextCost
                pq.add(Pair(nextCost, n.first))
            }
        }
    }

    println(dist[e])
}