package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (cnt, wins) = readLine().split(' ').map { it.toLong() }
    val z = wins * 100 / cnt

    var l = 0L
    var h = 1_000_000_000L
    var ans = -1L

    var m:Long
    while (l <= h) {
        m = (l + h) / 2
        if ((wins + m) * 100 / (cnt + m) != z) {
            ans = m
            h = m - 1
        } else {
            l = m + 1
        }
    }

    println(ans)
}