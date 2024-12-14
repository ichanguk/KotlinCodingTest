package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, T) = readLine().split(' ').map { it.toInt() }

    var ans = Int.MAX_VALUE

    repeat(n) {
        val (s, i, c) = readLine().split(' ').map { it.toInt() }
        var l = 1
        var h = c

        while (l <= h) {
            val m = (l + h) / 2

            val t = s + i * (m - 1)

            if (t >= T) {
                ans = minOf(ans, t - T)
                h = m - 1
            } else {
                l = m + 1
            }
        }
    }

    if (ans != Int.MAX_VALUE) {
        println(ans)
    } else {
        println(-1)
    }
}