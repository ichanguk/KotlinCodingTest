package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (a, b, c) = readLine().split(' ').map { it.toInt() }

    println("${c / b} ${c / a}")
}