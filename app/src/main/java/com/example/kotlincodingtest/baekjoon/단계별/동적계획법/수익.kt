package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var n = readLine().toInt()
    while (n != 0) {
        val revenue = LongArray(n) { 0 }
        repeat(n) {
            revenue[it] = readLine().toLong()
        }
        val dp = LongArray(n) { 0 }
        dp[0] = revenue[0]

        for (i in 1 until n) {
            dp[i] = maxOf(dp[i - 1] + revenue[i], revenue[i])
        }

        println(dp.max())
        n = readLine().toInt()
    }
}