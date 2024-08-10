package com.example.kotlincodingtest.baekjoon.단계별.최단경로

import java.io.BufferedReader

private lateinit var dist:LongArray
private const val INF = 1_000_000_000L

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val g = mutableListOf<Triple<Int, Int, Int>>()
    repeat(M) {
        val (a, b, c) = readLine().split(' ').map { it.toInt() }
        g.add(Triple(a, b, c))
    }

    dist = LongArray(N + 1) { INF }
    dist[1] = 0

    val isInf = bellmanFord(N, g)


    if (isInf) {
        println("-1")
    } else {
        for (i in 2..N) {
            if (dist[i] == INF) {
                println("-1")
            } else {
                println(dist[i])
            }
        }
    }

}

private fun bellmanFord( n: Int, g: MutableList<Triple<Int, Int, Int>>):Boolean  {
    for (i in 0 until n) {
        for (e in g) {
            val (cur, next, cost) = e
            if (dist[cur] != INF && dist[next] > dist[cur] + cost) {
                dist[next] = dist[cur] + cost
                if (i == n - 1) {
                    return true
                }
            }
        }
    }

    return false
}