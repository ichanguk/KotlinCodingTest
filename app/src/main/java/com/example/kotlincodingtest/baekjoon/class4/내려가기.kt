package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val nums = MutableList(N + 1) { listOf(0, 0, 0) }

    for (i in 1..N) {
        nums[i] = readLine().split(' ').map { it.toInt() }
    }

    val dpMax = MutableList(N + 1) { mutableListOf(0, 0, 0) }
    val dpMin = MutableList(N + 1) { mutableListOf(0, 0, 0) }


    for (i in 1..N) {
        dpMax[i][0] = maxOf(dpMax[i - 1][0], dpMax[i - 1][1]) + nums[i][0]
        dpMax[i][1] = dpMax[i - 1].max() + nums[i][1]
        dpMax[i][2] = maxOf(dpMax[i - 1][1], dpMax[i - 1][2]) + nums[i][2]

        dpMin[i][0] = minOf(dpMin[i - 1][0], dpMin[i - 1][1]) + nums[i][0]
        dpMin[i][1] = dpMin[i - 1].min() + nums[i][1]
        dpMin[i][2] = minOf(dpMin[i - 1][1], dpMin[i - 1][2]) + nums[i][2]
    }

    println("${dpMax[N].max()} ${dpMin[N].min()}")
}