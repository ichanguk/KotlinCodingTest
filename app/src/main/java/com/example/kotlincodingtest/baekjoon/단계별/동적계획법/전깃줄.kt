package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader
import kotlin.math.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val lines = MutableList(N) { Pair(0, 0) }
    for (i in 0 until N) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        lines[i] = Pair(a, b)
    }
    lines.sortBy { it.first }

    val dp = MutableList(N) { 0 }

    for (i in 0 until N) {
        dp[i] = 1
        for (j in 0 until i) {
            if (lines[i].second > lines[j].second) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
    }
    println(N - dp.max())
}