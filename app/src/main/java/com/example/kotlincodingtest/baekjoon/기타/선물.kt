package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n , l, w, h) = readLine().split(' ').map { it.toLong() }

    var low = 0.0
    var high = 1_000_000_000.0

    var ans = 1.0

    repeat(100) {
        val mid = (low + high) / 2

        if ((l / mid).toLong() * (w / mid).toLong() * (h / mid).toLong() >= n) {
            ans = mid
            low = mid
        } else {
            high = mid
        }
    }

    println(ans)

}