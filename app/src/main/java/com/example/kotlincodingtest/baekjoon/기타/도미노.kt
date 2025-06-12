package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    var ans = 0

    for (i in 0..n) {
        for (j in i..n) {
            ans += i + j
        }
    }
    println(ans)
}