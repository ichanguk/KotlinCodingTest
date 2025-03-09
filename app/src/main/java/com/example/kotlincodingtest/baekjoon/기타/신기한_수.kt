package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    var ans = 0

    for (i in 1..n) {
        val digitSum = i.toString().map { it - '0' }.sum()

        if (i % digitSum == 0) {
            ans++
        }
    }

    println(ans)
}