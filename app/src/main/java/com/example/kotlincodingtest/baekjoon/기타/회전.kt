package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (k, n) = readLine().split(' ').map { it.toInt() }

    if (n == 1) {
        println(-1)
    } else {
        println(k * n / (n - 1))
    }
}