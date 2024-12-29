package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import kotlin.math.abs
import kotlin.math.pow

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        val num = readLine()

        var frontNum = 0

        for (i in 0 until 3) {
            frontNum += (26.0.pow(2 - i)).toInt() * (num[i] - 'A')
        }

        if (abs(frontNum - num.substring(4, 8).toInt()) <= 100) {
            println("nice")
        } else {
            println("not nice")
        }
    }
}