package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader
import kotlin.math.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    if (n == 1) {
        println(readLine().toInt())
        return
    }
    if (n == 2) {
        println(readLine().toInt() + readLine().toInt())
        return
    }
    val wines = MutableList(n) { 0 }
    for (i in 0 until n) {
        wines[i] = readLine().toInt()
    }

    val dp = MutableList(n) { 0 }
    dp[0] = wines[0]
    dp[1] = wines[0] + wines[1]
    dp[2] = max(dp[0] + wines[2], max(dp[1], wines[1] + wines[2]))

    var nextMax = 0
    for (i in 3 until n) {
        nextMax = max(dp[i - 2], dp[i - 3] + wines[i - 1]) + wines[i]
        if (nextMax > dp[i - 1]) {
            dp[i] = nextMax
        } else {
            dp[i] = dp[i - 1]
        }
    }
    println(dp[n - 1])
}