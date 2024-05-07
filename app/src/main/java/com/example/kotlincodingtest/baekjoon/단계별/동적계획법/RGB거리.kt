package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.min

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val dp = MutableList(N + 1) { mutableListOf(0, 0, 0) }

    val st = StringTokenizer(readLine())
    dp[1][0] = st.nextToken().toInt()
    dp[1][1] = st.nextToken().toInt()
    dp[1][2] = st.nextToken().toInt()

    for (i in 2..N) {
        val (R, G, B) = readLine().split(' ').map { it.toInt() }
        dp[i][0] = if (dp[i - 1][1] < dp[i - 1][2]) dp[i - 1][1] + R else dp[i - 1][2] + R
        dp[i][1] = if (dp[i - 1][0] < dp[i - 1][2]) dp[i - 1][0] + G else dp[i - 1][2] + G
        dp[i][2] = if (dp[i - 1][0] < dp[i - 1][1]) dp[i - 1][0] + B else dp[i - 1][1] + B
    }
    println(min(dp[N][0], min(dp[N][1], dp[N][2])))
}