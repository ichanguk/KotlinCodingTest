package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        repeat(it + 1) {
            print('*')
        }
        repeat(2 * (n - it - 1)) {
            print(' ')
        }
        repeat(it + 1) {
            print('*')
        }
        println()
    }

    repeat(n - 1) {
        repeat(n - it - 1) {
            print('*')
        }
        repeat(2 * (it + 1)) {
            print(' ')
        }
        repeat(n - it - 1) {
            print('*')
        }
        println()
    }
}