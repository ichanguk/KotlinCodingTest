package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val input = readLine()

    for (i in 0 until input.length / 2) {
        if (input[i] != input[input.length - (i + 1)]) {
            println("false")
            return@with
        }
    }
    println("true")
}