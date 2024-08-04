package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, l) = readLine().split(' ').map { it.toInt() }

    var a = 0.0
    for (i in l..100) {
        a = 0.5 * (2 * n.toDouble() / i - i + 1)
        if (a >= 0 && a % 1 == 0.0) {
            repeat(i) {
                print("${a.toInt() + it} ")
            }
            return@with
        }
    }

    println(-1)
}