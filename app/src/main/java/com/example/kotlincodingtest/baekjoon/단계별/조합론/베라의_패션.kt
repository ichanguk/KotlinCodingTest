package com.example.kotlincodingtest.baekjoon.단계별.조합론

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    println(N * N - N)
}