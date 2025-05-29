package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (a, b) = readLine().split(' ').map { it.toInt() }

    println((b - a) / 2 + 1)
}