package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val nums = readLine().split(' ').map { it.toInt() }

    val dp = MutableList(N) { 1 }
    var postMax = 0
    var postI = 0
    for (i in (N - 2) downTo 0) {
        postMax = 0
        postI = i
        for (j in (N - 1) downTo (i + 1)) {
            if (nums[j] < nums[i] && dp[j] > postMax) {
                postMax = dp[j]
                postI = j
            }
        }
        if (postI != i) {
            dp[i] = dp[postI] + 1
        }
    }
    println(dp.max())
}