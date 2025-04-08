package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val dp = IntArray(100001) { 0 }

    dp[2] = 1
    dp[4] = 2
    dp[5] = 1

    for (i in 6..n) {
        if (dp[i - 2] != 0 && dp[i - 5] != 0) {
            dp[i] = minOf(dp[i - 2], dp[i - 5]) + 1
        } else if (dp[i - 2] != 0) {
            dp[i] = dp[i - 2] + 1
        } else if (dp[i - 5] != 0) {
            dp[i] = dp[i - 5] + 1
        }
    }

    if (dp[n] == 0) {
        println(-1)
    } else {
        println(dp[n])
    }
}