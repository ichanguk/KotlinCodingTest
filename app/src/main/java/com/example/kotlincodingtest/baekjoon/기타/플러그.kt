package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    var ans = readLine().toInt()

    repeat(n - 1) {
        ans += readLine().toInt() - 1
    }

    println(ans)
}