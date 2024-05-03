package com.example.kotlincodingtest.baekjoon.단계별.재귀

import java.io.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    println(fact(N))
}

fun fact(N: Int): Long {
    if (N <= 1) {
        return 1
    } else {
        return N * fact(N - 1)
    }
}