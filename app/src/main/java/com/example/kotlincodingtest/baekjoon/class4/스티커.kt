package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()
    repeat(T) {
        val N = readLine().toInt()
        val scores = MutableList(2) { MutableList(N + 1) { 0 } }
        scores[0] = readLine().split(' ').map { it.toInt() }.toMutableList()
        scores[1] = readLine().split(' ').map { it.toInt() }.toMutableList()

        val dp = MutableList(2) { MutableList(N + 1) { 0 } }
        scores[0].add(0, 0)
        scores[1].add(0, 0)


        dp[0][1] = scores[0][1]
        dp[1][1] = scores[1][1]

        for (i in 2..N) {
            dp[0][i] = maxOf(dp[1][i - 1], dp[1][i - 2]) + scores[0][i]
            dp[1][i] = maxOf(dp[0][i - 1], dp[0][i - 2]) + scores[1][i]
        }
        println(maxOf(dp[0][N], dp[1][N]))
    }
}