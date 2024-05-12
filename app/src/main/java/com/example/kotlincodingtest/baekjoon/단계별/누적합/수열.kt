package com.example.kotlincodingtest.baekjoon.단계별.누적합

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, K) = readLine().split(' ').map { it.toInt() }

    val temp = readLine().split(' ').map { it.toInt() }

    var cur = 0
    for (i in 0 until K) {
        cur += temp[i]
    }
    var max = cur
    for (i in 1..(N - K)) {
        cur = cur - temp[i - 1] + temp[i + K - 1]
        if (cur > max) {
            max = cur
        }
    }
    println(max)
}