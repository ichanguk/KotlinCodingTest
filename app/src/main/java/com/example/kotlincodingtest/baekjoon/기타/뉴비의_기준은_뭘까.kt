package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m) = readLine().split(' ').map { it.toInt() }

    if (m <= 2) {
        println("NEWBIE!")
    } else if (m <= n) {
        println("OLDBIE!")
    } else {
        println("TLE!")
    }
}