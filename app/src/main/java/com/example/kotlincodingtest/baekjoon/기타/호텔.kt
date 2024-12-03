package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (c, n) = readLine().split(' ').map { it.toInt() }
    val dp = IntArray(100001) { 0 }
    val costs = Array(n) { Pair(0, 0) }

    repeat(n) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        costs[it] = Pair(a, b)
    }

    var i = 1

    while(true) {
        dp[i] = dp[i - 1]
        for (cost in costs) {
            if (i - cost.first >= 0) {
                dp[i] = maxOf(dp[i], dp[i - cost.first] + cost.second)
            }
        }
        if (dp[i] >= c) {
            println(i)
            break
        }
        i++
    }

}