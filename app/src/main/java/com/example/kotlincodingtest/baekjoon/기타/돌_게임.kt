package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    if (n == 1) {
        println("SK")
        return@with
    }

    if (n == 2) {
        println("CY")
        return@with
    }

    val dp = IntArray(n + 1) { 0 }

    dp[1] = 1
    dp[2] = 2
    dp[3] = 1

    for (i in 4..n) {
        dp[i] = minOf(dp[i - 1], dp[i - 3]) + 1
    }

    if (dp[n] % 2 == 0) {
        println("CY")
    } else {
        println("SK")
    }
}