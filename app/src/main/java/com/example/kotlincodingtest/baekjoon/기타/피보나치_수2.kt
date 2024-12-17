package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    val dp = LongArray(91) { 0 }

    dp[1] = 1

    for (i in 2..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    println(dp[n])
}