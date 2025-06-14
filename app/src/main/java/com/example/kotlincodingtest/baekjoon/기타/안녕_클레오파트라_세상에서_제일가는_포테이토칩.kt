package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, s) = readLine().split(' ').map { it.toInt() }
    val maxEcho = readLine().split(' ').map { it.toInt() }

    var cur = s
    var ans = 0

    while (true) {
        if (maxEcho[ans] < cur) {
            break
        }
        ans = (ans + 1) % n
        cur++
    }

    println(ans + 1)
}