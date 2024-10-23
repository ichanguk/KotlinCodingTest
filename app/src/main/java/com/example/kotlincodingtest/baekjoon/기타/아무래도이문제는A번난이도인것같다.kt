package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val t = readLine().toInt()
    repeat(t) {
        val (a, b) = readLine().split(' ').map { it.toInt() }

        println("yes")
    }
}