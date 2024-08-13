package com.example.kotlincodingtest.baekjoon.단계별.동적계획법2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, k) = readLine().split(' ').map { it.toInt() }

    val coins = IntArray(n) { 0 }
    repeat(n) {
        coins[it] = readLine().toInt()
    }
    val dp = IntArray(k + 1) { 0 }
    dp[0] = 1

    for (c in coins) {
        for (i in c..k) {
            dp[i] += dp[i - c]
        }
    }

    println(dp[k])
}