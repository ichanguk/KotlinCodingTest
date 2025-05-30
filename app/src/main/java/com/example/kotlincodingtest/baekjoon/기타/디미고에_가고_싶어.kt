package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (a, b) = readLine().split(' ').map { it.toInt() }

    var ans = (b - a) / 2 + 1
    if (a % 2 == 0 && b % 2 == 1) {
        ans++
    }

    println(ans)
}