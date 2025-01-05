package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    val tips = MutableList(n) { 0 }
    repeat(n) {
        tips[it] = readLine().toInt()
    }

    var ans = 0L
    tips.sortedByDescending { it }.forEachIndexed { idx, tip ->
        if (tip - idx > 0) {
            ans += tip - idx
        }
    }

    println(ans)
}