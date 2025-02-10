package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val hiddenNum = readLine().split(Regex("\\D+")).filter { it.isNotEmpty() }.map { it.toInt() }

    println(hiddenNum.sum())
}