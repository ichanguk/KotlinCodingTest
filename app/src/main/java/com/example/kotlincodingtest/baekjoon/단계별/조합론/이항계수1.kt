package com.example.kotlincodingtest.baekjoon.단계별.조합론

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, K) = readLine().split(' ').map { it.toInt() }

    println(combi(N, K))
}

fun combi(n: Int, k: Int): Int {
    return fact(n) / fact(n - k) / fact(k)
}


private fun fact(n: Int): Int {
    var res = 1
    for (i in 1..n) {
        res *= i
    }
    return res
}
