package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    for (i in n downTo 0) {
        repeat(i) {
            print('*')
        }
        println()
    }
}