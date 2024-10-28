package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m, r) = readLine().split(' ').map { it.toInt() }
    val countList = readLine().split(' ').map { it.toInt() }

    val g = MutableList(n + 1) { MutableList(n + 1) { 2_000 } }

    repeat(r) {
        val (a, b, c) = readLine().split(' ').map { it.toInt() }
        g[a][b] = c
        g[b][a] = c
    }

    for (i in 1..n) {
        g[i][i] = 0
    }

    for (k in 1..n) {
        for (i in 1..n) {
            for (j in 1..n) {
                g[i][j] = minOf(g[i][j], g[i][k] + g[k][j])
            }
        }
    }

    val maxItemList = MutableList(n + 1) { 0 }

    for (i in 1..n) {
        for (j in 1..n) {
            if (g[i][j] <= m) {
                maxItemList[i] += countList[j- 1]
            }
        }
    }

    println(maxItemList.max())
}