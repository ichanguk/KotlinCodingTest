package com.example.kotlincodingtest.baekjoon.단계별.재귀

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toLong()
    println(pibo(N))
}

fun pibo(n: Long): Long {
    if (n == 0L) {
        return 0
    } else if (n == 1L) {
        return 1
    } else {
        return pibo(n - 1) + pibo(n - 2)
    }
}
