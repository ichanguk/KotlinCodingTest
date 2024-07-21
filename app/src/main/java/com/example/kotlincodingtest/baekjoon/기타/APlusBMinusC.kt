package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val a = readLine()
    val b = readLine()
    val c = readLine().toInt()

    println(a.toInt() + b.toInt() - c)
    println((a + b).toInt() - c)
}