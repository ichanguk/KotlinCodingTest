package com.example.kotlincodingtest.baekjoon.단계별.그리디_알고리즘

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val timeList = readLine().split(' ').map { it.toInt() }.toMutableList()
    timeList.sort()
    val timeSum = MutableList(N + 1) { 0 }

    for (i in 0 until N) {
        timeSum[i + 1] = timeList[i] + timeSum[i]
    }
    println(timeSum.sum())
}
