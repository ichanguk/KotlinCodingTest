package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val magnets = readLine()

    for (i in 1 until 2 * n) {
        if (magnets[i] == magnets[i - 1]) {
            println("No")
            return@with
        }
    }
    println("Yes")
}