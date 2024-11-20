package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.lang.StringBuilder
import kotlin.math.sqrt

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val t = readLine().toInt()

    repeat(t) {
        val input = readLine()
        val n = sqrt(input.length.toDouble()).toInt()
        val sb = StringBuilder()

        for (i in (n - 1) downTo 0) {
            for (j in 0 until n) {
                sb.append(input[j * n + i])
            }
        }
        println(sb.toString())
        sb.clear()
    }
}
