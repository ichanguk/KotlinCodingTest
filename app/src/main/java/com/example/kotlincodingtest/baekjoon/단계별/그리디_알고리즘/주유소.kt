package com.example.kotlincodingtest.baekjoon.단계별.그리디_알고리즘

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val distanceList = readLine().split(' ').map { it.toInt() }
    val costList = readLine().split(' ').map { it.toLong() }

    var cost = 0L
    var cur = Long.MAX_VALUE
    for (i in 0 until (N - 1)) {
        if (costList[i] < cur) {
            cur = costList[i]
        }
        cost += cur * distanceList[i]
    }

    println(cost)
}