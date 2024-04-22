package com.example.kotlincodingtest.baekjoon.단계별.심화1

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N: Int = readLine().toInt()

    for (i in 1..N) {
        for (j in 1 ..(N - i)) {
            print(' ')
        }
        for (j in 1..(2 * i - 1)) {
            print('*')
        }
        println()
    }

    for (i in 1 until N) {
        for (j in 1 ..i) {
            print(' ')
        }
        for (j in 1..(2 * (N - i) - 1)) {
            print('*')
        }
        println()
    }

}