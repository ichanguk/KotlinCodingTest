package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }

    var sixMin = Integer.MAX_VALUE
    var oneMin = Integer.MAX_VALUE

    repeat(M) {
        val (s, o) = readLine().split(' ').map { it.toInt() }
        sixMin = minOf(sixMin, s)
        oneMin = minOf(oneMin, o)
    }

    if (sixMin > oneMin * 6) {
        sixMin = oneMin * 6
    }

    println(minOf(N / 6 * sixMin + N % 6 * oneMin, sixMin * (N / 6 + 1)))
}