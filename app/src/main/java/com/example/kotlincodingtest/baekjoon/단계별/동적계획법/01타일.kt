package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader

private var dp = mutableListOf(0)

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    dp = MutableList<Int>(1000001) { 0 }
    dp[1] = 1
    dp[2] = 2
    for (i in 3..N) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % 15746
    }
    println(dp[N])
}
