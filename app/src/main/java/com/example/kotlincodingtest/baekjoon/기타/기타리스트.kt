package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, s, m) = readLine().split(' ').map { it.toInt() }

    val dp = Array(n + 1) { BooleanArray(m + 1) { false } }
    dp[0][s] = true

    val volList = readLine().split(' ').map { it.toInt() }
    for (i in 1..n) {
        for (j in 0..m) {
            if (dp[i - 1][j]) {
                if (j - volList[i - 1] in 0..m) {
                    dp[i][j - volList[i - 1]] = true
                }
                if (j + volList[i - 1] in 0..m) {
                    dp[i][j + volList[i - 1]] = true
                }
            }
        }
    }

    for (i in m downTo 0) {
        if (dp[n][i]) {
            println(i)
            return@with
        }
    }

    println(-1)
}