package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var x = readLine().toInt()
    val dp = MutableList<Int>(x + 1) { 0 }

    for (i in x downTo 1) {
        if (i % 3 == 0) {
            if (dp[i / 3] == 0 || dp[i / 3] > dp[i] + 1) {
                dp[i / 3] = dp[i] + 1
            }
        }
        if (i % 2 == 0) {
            if (dp[i / 2] == 0 || dp[i / 2] > dp[i] + 1) {
                dp[i / 2] = dp[i] + 1
            }
        }
        if (dp[i - 1] == 0 || dp[i - 1] > dp[i] + 1) {
            dp[i - 1] = dp[i] + 1
        }
    }
    println(dp[1])
}