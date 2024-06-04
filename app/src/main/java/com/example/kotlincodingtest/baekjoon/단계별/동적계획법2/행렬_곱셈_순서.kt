package com.example.kotlincodingtest.baekjoon.단계별.동적계획법2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val matrixes = MutableList(N + 1) { 0 }
    val dp = MutableList(N) { MutableList(N) { 0 } }

    repeat(N) { i ->
        val (r, c) = readLine().split(' ').map { it.toInt() }
        matrixes[i] = r
        matrixes[i + 1] = c
    }

    for (i in 2..N) {
        for (j in 0..(N - i)) {
            dp[j][j + i - 1] = Int.MAX_VALUE
            for (k in j until (j + i - 1)) {
                dp[j][j + i - 1] = minOf(
                    dp[j][j + i - 1],
                    dp[j][k] + dp[k + 1][j + i - 1] + matrixes[j] * matrixes[k + 1] * matrixes[j + i]
                )
            }
        }
    }

    println(dp[0][N - 1])
}