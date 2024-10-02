package com.example.kotlincodingtest.baekjoon.단계별.동적계획법2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }

    val memories = readLine().split(' ').map { it.toInt() }
    val costs = readLine().split(' ').map { it.toInt() }
    val costSum = costs.sum()

    val dp = Array(N + 1) { IntArray(costSum + 1) { 0 } }

    for (i in 1..N) {
        for (j in 0..costSum) {
            if (j - costs[i - 1] >= 0) {
                dp[i][j] = maxOf(dp[i - 1][j], dp[i - 1][j - costs[i - 1]] + memories[i - 1])
            } else {
                dp[i][j] = dp[i - 1][j]
            }
        }
    }

    println(dp[N].indexOfFirst { it >= M })

}