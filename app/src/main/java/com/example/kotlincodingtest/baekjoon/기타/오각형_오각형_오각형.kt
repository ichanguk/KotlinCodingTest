package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    var ans = 5L
    var a = 7

    for (i in 2..n) {
        ans += a
        ans %= 45678
        a +=3
    }

    println(ans)
}