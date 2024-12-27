package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import kotlin.math.abs

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m) = readLine().split(' ').map { it.toInt() }

    val a = maxOf(n, m) - 1
    val b = minOf(n, m) - 1

    println( (a / 4)  - (b / 4) + abs((a % 4) - (b % 4)) )
}