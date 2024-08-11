package com.example.kotlincodingtest.baekjoon.단계별.최단경로

import java.io.BufferedReader

private const val INF = 1_000_000_000

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (V, E) = readLine().split(' ').map { it.toInt() }
    val dist = Array(V + 1) { IntArray(V + 1) { INF } }

    for (i in 1..V) {
        dist[i][i] = 0
    }

    repeat(E) {
        val (a, b, c) = readLine().split(' ').map { it.toInt() }
        dist[a][b] = c
    }

    for (k in 1..V) {
        for (i in 1..V) {
            for (j in 1..V) {
                if (i == j) {
                    continue
                }

                if (dist[i][j] > dist[i][k] + dist[k][j]) {
                    dist[i][j] = dist[i][k] + dist[k][j]
                }
            }
        }
    }

    var ans = INF

    for (i in 1..V) {
        for (j in (i + 1)..V) {
            if (dist[i][j] != INF && dist[j][i] != INF) {
                ans = minOf(ans, dist[i][j] + dist[j][i])
            }
        }
    }

    if (ans == INF) {
        println("-1")
    } else {
        println(ans)
    }
}