package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, w, h, l) = readLine().split(' ').map { it.toInt() }

    if (w < l || h < l) {
        println(0)
        return@with
    }
    val ans = (w / l) * (h / l)

    println(minOf(ans, n))
}