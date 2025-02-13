package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val line = BooleanArray(10001)
    repeat(n) {
        val (s, e) = readLine().split(' ').map { it.toInt() }

        for (i in s until e) {
            line[i] = true
        }
    }

    println(line.count { it })
}