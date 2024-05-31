package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader
import kotlin.math.sqrt

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val dp = MutableList(N + 1) { 0 }

    for (i in 1..N) {
        dp[i] = dp[i - 1] + 1
        for (j in 1..sqrt(i.toDouble()).toInt()) {
            dp[i] = minOf(dp[i], dp[i - j * j] + 1)
        }
    }

    println(dp[N])
}