package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import kotlin.math.pow

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine()

    var ans = 0L
    n.forEach {
        ans += (it - '0').toDouble().pow(5).toLong()
    }

    println(ans)
}