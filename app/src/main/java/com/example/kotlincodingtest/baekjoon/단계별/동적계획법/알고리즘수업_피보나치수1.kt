package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader

private var f = mutableListOf<Long>()

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    f = MutableList<Long>(n + 1){0}
    println(fibo(n))
    println(n - 2)
}


private fun fibo(n: Int): Long {
    f[3] = 2
    f[4] = 3
    for (i in 5..n) {
        f[i] = f[i - 1] + f [i - 2]
    }
    return f[n]
}
