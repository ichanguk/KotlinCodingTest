package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (a, b) = readLine().split(' ')

    val num1 = if (a.length >= b.length) a else b
    val num2 = if (a.length >= b.length) b else a

    val sb = StringBuilder(num1.substring(0 until num1.length - num2.length))

    for (i in (num1.length - num2.length) until num1.length) {
        sb.append((num1[i] - '0') + (num2[i - (num1.length - num2.length)] - '0'))
    }

    println(sb.toString())

}