package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    if (N == 1) {
        println(readLine())
        return
    }
    val intTriangle = MutableList(N + 1) { List(N + 1) { 0 } }
    val dp = MutableList(N + 1) { MutableList(N + 1) { 0 } }

    for (i in 1..N) {
        intTriangle[i] = readLine().split(' ').map { it.toInt() }
    }
    dp[1][1] = intTriangle[1][0]
    for (i in 2..N) {
        for (j in 1..i) {
            dp[i][j] = if (dp[i - 1][j - 1] >= dp[i - 1][j]) dp[i - 1][j - 1] + intTriangle[i][j - 1] else dp[i - 1][j] + intTriangle[i][j - 1]
        }
    }
    println(dp[N].max())
}