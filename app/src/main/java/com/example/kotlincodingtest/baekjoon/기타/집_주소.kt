package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val blank = intArrayOf(4, 2, 3, 3, 3, 3, 3, 3, 3, 3)
    while (true) {
        val n = readLine()
        if (n == "0") {
            break
        }

        var ans = 1
        for (c in n) {
            ans += blank[c - '0'] + 1
        }

        println(ans)
    }
}