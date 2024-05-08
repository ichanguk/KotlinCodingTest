package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader
import kotlin.math.max

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val nums = readLine().split(' ').map { it.toInt() }

    val dp = MutableList(N) { 1 }
    for (i in 1 until N) {
        var prevMax = 0
        var targetIdx = i
        for (j in (i - 1) downTo 0) {
            if (dp[j] > prevMax && nums[j] < nums[i]) {
                prevMax = dp[j]
                targetIdx = j
            }
        }
        if (targetIdx != i) {
            dp[i] = dp[targetIdx] + 1
        }
    }
    println(dp.max())
}