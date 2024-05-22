package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.io.BufferedWriter

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()
    val dp = MutableList(41) { Pair(0, 0) }

    dp[0] = Pair(1, 0)
    dp[1] = Pair(0, 1)

    for (i in 2..40) {
        dp[i] = Pair(dp[i - 1].first + dp[i - 2].first, dp[i - 1].second + dp[i - 2].second)
    }

    val bw = BufferedWriter(System.out.bufferedWriter())
    var n:Int
    for (i in 1..T) {
        n = readLine().toInt()
        bw.write("${dp[n].first} ${dp[n].second}\n")
    }

    bw.flush()
    bw.close()
}