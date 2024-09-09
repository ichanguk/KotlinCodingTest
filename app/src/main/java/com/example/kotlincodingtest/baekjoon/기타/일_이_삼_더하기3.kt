package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())){
    val t = readLine().toInt()
    val input = IntArray(t) { 0 }
    var maxN = 0

    for (i in 0 until t) {
        input[i] = readLine().toInt()
        if (input[i] > maxN) {
            maxN = input[i]
        }
    }

    val dp = LongArray(maxN + 1) { 0 }
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for (i in 4..maxN) {
        dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1_000_000_009
    }

    for (n in input) {
        println(dp[n])
    }

}