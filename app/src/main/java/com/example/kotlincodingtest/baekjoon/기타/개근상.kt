package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

private const val DIV = 1_000_000

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val dp = Array(1001) { Array(2) { IntArray(3) { 0 } } }

    dp[1][0][0] = 1
    dp[1][0][1] = 1
    dp[1][1][0] = 1

    for (i in 2..n) {
        dp[i][0][0] = (dp[i - 1][0][0] + dp[i - 1][0][1] + dp[i - 1][0][2]) % DIV
        dp[i][0][1] = dp[i - 1][0][0]
        dp[i][0][2] = dp[i - 1][0][1]

        dp[i][1][0] = (dp[i - 1][0][0] + dp[i - 1][0][1] + dp[i - 1][0][2] +
                dp[i - 1][1][0] + dp[i - 1][1][1] + dp[i - 1][1][2]) % DIV
        dp[i][1][1] = dp[i - 1][1][0]
        dp[i][1][2] = dp[i - 1][1][1]
    }

    println((dp[n][0][0] + dp[n][0][1] + dp[n][0][2] + dp[n][1][0] + dp[n][1][1] + dp[n][1][2]) % DIV)
}