package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val score = readLine().split(' ').map { it.toInt() }

    var ans = if (score.sum() >= 100) "draw" else "none"

    for (i in 0 until 9) {
        if (score[i] > 100 * (i / 2 + 1)) {
            ans = "hacker"
            break
        }
    }

    println(ans)
}