package com.example.kotlincodingtest.baekjoon.단계별.일반수학1

import java.io.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()
    var C: Int = 0

    for (i in 1..T) {
        C = readLine().toInt()

        print(C / 25)
        print(' ')
        C -= 25 * (C / 25)

        print(C / 10)
        print(' ')
        C -= 10 * (C / 10)

        print(C / 5)
        print(' ')
        C -= 5 * (C / 5)

        print("$C\n")
    }
}