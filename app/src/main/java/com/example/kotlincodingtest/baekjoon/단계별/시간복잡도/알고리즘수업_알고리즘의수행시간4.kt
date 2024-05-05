package com.example.kotlincodingtest.baekjoon.단계별.시간복잡도

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toLong()
    println((n - 1) * n / 2)
    println(2)
}