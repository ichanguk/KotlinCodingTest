package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n - 1) {
        repeat(n - 1 - it) {
            print(' ')
        }
        print('*')
        repeat(2 * it - 1) {
            print(' ')
        }
        if (it > 0) {
            print('*')
        }
        println()
    }
    repeat(2 * n - 1) {
        print('*')
    }
    println()
}