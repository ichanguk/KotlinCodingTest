package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        repeat(it) {
            print(' ')
        }
        repeat(2 * n - 2 * (it + 1) + 1) {
            print('*')
        }
        println()
    }
}