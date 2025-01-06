package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    for (i in 0 until n) {
        repeat(i) {
            print(' ')
        }
        repeat(2 * n - (2 * i + 1)) {
            print('*')
        }
        println()
    }
    for (i in (n - 2) downTo 0) {
        repeat(i) {
            print(' ')
        }
        repeat(2 * n - (2 * i + 1)) {
            print('*')
        }
        println()
    }
}