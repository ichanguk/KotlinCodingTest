package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (k, n) = readLine().split(' ').map { it.toLong() }

    if (n == 1L) {
        println(-1)
    } else {
        var ans = k * n / (n - 1)
        if (k * n % (n - 1) > 0) {
            ans++
        }
        println(ans)
    }
}