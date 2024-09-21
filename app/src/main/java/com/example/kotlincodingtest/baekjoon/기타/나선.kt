package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (M, N) = readLine().split(' ').map { it.toInt() }

    val minSize = minOf(M, N)
    var outside = minSize / 2
    if (minSize % 2 == 0) {
        outside--
    }

    val m = M - outside * 2
    val n = N - outside * 2

    var x = outside
    var y = outside

    if (n == 1 && m > n) {
        x = M - outside - 1
    }
    if (m == 2 && n > m) {
        y = N - outside - 2
    }

    println("$x ${N - (y + 1)}")

}