package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n - 1) {
        repeat(it + 1) {
            print('*')
        }
        println()
    }

    repeat(n) {
        repeat(n - it) {
            print('*')
        }
        println()
    }
}