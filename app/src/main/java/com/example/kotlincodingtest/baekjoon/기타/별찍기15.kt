package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n - 1) {
        print(' ')
    }
    println('*')

    for (i in 1 until n) {
        repeat(n - i - 1) {
            print(' ')
        }
        print('*')
        repeat(2 * i - 1) {
            print(' ')
        }
        println('*')
    }
}