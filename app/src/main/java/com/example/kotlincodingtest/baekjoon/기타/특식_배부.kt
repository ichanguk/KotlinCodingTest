package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val (a, b, c) = readLine().split(' ').map { it.toInt() }

    var ans = 0
    ans += if (a >= n) n else a
    ans += if (b >= n) n else b
    ans += if (c >= n) n else c

    println(ans)
}