package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val dp = readLine().split(' ').map { it.toInt() }.toMutableList()

    for (i in 1 until N) {
        if (dp[i - 1] + dp[i] > dp[i]) {
            dp[i] = dp[i - 1] + dp[i]
        }
    }
    println(dp.max())
}