package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    while (true) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        val sum = a + b
        if (sum == 0) {
            break
        } else {
            println(sum)
        }
    }
}