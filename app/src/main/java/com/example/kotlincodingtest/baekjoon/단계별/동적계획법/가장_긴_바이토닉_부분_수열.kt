package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val nums = readLine().split(' ').map { it.toInt() }

    val dpPre = MutableList(N) { 0 }
    val dpPost = MutableList(N) { 0 }
    val dp = MutableList(N) { 1 }

    var preMax = 0
    var preI = 0

    for (i in 1 until N) {
        preMax = -1
        preI = i
        for (j in 0 until i) {
            if (nums[j] < nums[i] && dpPre[j] > preMax) {
                preMax = dpPre[j]
                preI = j
            }
        }
        if (preI != i) {
            dpPre[i] = dpPre[preI] + 1
        }
    }

    var postMax = 0
    var postI = 0

    for (i in (N - 2) downTo 0) {
        postMax = -1
        postI = i
        for (j in (N - 1) downTo (i + 1)) {
            if (nums[j] < nums[i] && dpPost[j] > postMax) {
                postMax = dpPost[j]
                postI = j
            }
        }
        if (postI != i) {
            dpPost[i] = dpPost[postI] + 1
        }
        dp[i] = dpPre[i] + dpPost[i] + 1
    }
    dp[N - 1] = dpPre[N - 1] + dpPost[N - 1] + 1


    println(dp.max())
}

