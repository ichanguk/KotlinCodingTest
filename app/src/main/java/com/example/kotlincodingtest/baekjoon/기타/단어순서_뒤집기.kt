package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        val input = readLine().split(' ')
        println("Case #${it + 1}: ${input.reversed().joinToString(separator = " ")}")
    }
}