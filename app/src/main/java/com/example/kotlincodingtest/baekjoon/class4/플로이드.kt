package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val g = MutableList(N + 1) { MutableList(N + 1) { Integer.MAX_VALUE } }
    val M = readLine().toInt()

    repeat(M) {
        val (s, e, c) = readLine().split(' ').map { it.toInt() }

        if (c < g[s][e]) {
            g[s][e] = c
        }
    }

    for (i in 1..N) {
        g[i][i] = 0
    }

    for (k in 1..N) {
        for (i in 1..N) {
            for (j in 1..N) {
                if (g[i][k] != Integer.MAX_VALUE && g[k][j] != Integer.MAX_VALUE &&
                    g[i][j] > g[i][k] + g[k][j]
                ) {
                    g[i][j] = g[i][k] + g[k][j]
                }
            }
        }
    }

    g.drop(1).forEach {
        it.drop(1).forEach {
            if (it == Integer.MAX_VALUE) {
                print("0 ")
            } else {
                print("$it ")
            }
        }
        println()
    }

}