package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val distances = IntArray(n + 1) { 0 }

    for (i in 1..n) {
        distances[i] = readLine().toInt()
    }

    val dp = Array(n + 1) { IntArray(m + 1) { 0 } }

    for (i in 1..n) {
        for (j in 1..m) {
            dp[i][j] = dp[i - 1][j - 1] + distances[i]
        }
        for (j in 1..m) {
            if (j > i) {
                break
            }
            dp[i][0] = maxOf(dp[i][0], dp[i - j][j], dp[i - j][0])
        }
    }

    println(dp[n][0])
}