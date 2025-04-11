package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val t = readLine().toInt()

    repeat(t) {
        val (n, m) = readLine().split(' ').map { it.toInt() }

        for (i in 0..m) {
            if (m + i == n) {
                println("${m - i} $i")
                break
            }
        }
    }

}