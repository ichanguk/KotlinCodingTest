package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val scores = MutableList(N) { 0 }
    for (i in 0 until N) {
        scores[i] = readLine().toInt()
    }
    scores.sort()
    val outlierPer = Math.round(N * 0.15).toInt()

    var sum = 0
    for (i in outlierPer until (N - outlierPer)) {
        sum += scores[i]
    }
    val res = Math.round(sum / (N - 2 * outlierPer).toDouble()).toInt()
    println(res)
}