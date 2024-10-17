package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var (n, a, b) = readLine().split(' ').map { it.toInt() }

    var cnt = 1

    while (n > 0) {
        a = (a + 1) / 2
        b = (b + 1) / 2
        if (a == b) {
            println(cnt)
            return@with
        }
        if (n % 2 == 1) {
            n = n / 2 + 1
        } else {
            n /= 2
        }
        cnt++
    }

    println(-1)
}