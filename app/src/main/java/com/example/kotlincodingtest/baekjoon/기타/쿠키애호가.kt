package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val t = readLine().toInt()

    repeat(t) {
        val (n, c) = readLine().split(' ').map { it.toInt() }

        if (n % c > 0) {
            println(n / c + 1)
        } else {
            println(n / c)
        }
    }
}