package com.example.kotlincodingtest.baekjoon.단계별.조합론

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    println(fact(N))
}

fun fact(n: Int): Int {
    var res = 1
    for (i in 1..n) {
        res *= i
    }
    return res
}
