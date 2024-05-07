package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader
import kotlin.math.max

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    if (N == 1) {
        println(readLine())
        return
    }
    if (N == 2) {
        println(readLine().toInt() + readLine().toInt())
        return
    }
    val dp = MutableList<Int>(N + 1) { 0 }
    val score = MutableList<Int>(N + 1) {0}
    for (i in 0 until N) {
        score[i] = readLine().toInt()
    }
    dp[0] = score[0]
    dp[1] = score[0] + score[1]
    dp[2] = max(score[0], score[1]) + score[2]
    for (i in 3 until N) {
        dp[i] = max(dp[i - 2], dp[i - 3] + score[i - 1]) + score[i]
    }
    println(dp[N - 1])
}