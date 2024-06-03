package com.example.kotlincodingtest.baekjoon.단계별.동적계획법2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    repeat(readLine().toInt()) {
        val N = readLine().toInt()
        val dataList = readLine().split(' ').map { it.toInt() }
        val sum = MutableList(N + 1) { 0 }
        val dp = MutableList(N + 1) { MutableList(N + 1) { 0 } }

        for (i in 1..N) {
            sum[i] = sum[i - 1] + dataList[i - 1]
        }

        for (i in 2..N) {
            for (j in (i - 1) downTo 1) {
                dp[j][i] = Int.MAX_VALUE
                for (k in j until i) {
                    dp[j][i] = minOf(dp[j][i], dp[j][k] + dp[k + 1][i])
                }
                dp[j][i] += sum[i] - sum[j - 1]
            }
        }
        println(dp[1][N])

    }
}