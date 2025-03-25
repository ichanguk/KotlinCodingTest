package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toLong()
    var ans = 0L

    for (i in 1 until n) {
        ans += n * i + i
    }
    println(ans)
}