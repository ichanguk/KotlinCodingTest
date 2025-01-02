package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (a, b) = readLine().split(' ').map { it.toInt() }

    val dp = IntArray(b + 1) { 0 }

    var i = 1
    var idx = 1
    while (idx <= b) {
        repeat(i) {
            if (idx <= b) {
                dp[idx] = dp[idx - 1] + i
                idx++
            }
        }
        i++
    }

    println(dp[b] - dp[a - 1])
}