package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val input = readLine()

    val sb = StringBuilder()
    val vowels = setOf('a', 'e', 'i', 'o', 'u')

    for (i in 1 until input.length) {
        if (vowels.contains(input[i]) && input[i - 1] == 'p') {
            sb.append(input[i])
        }
    }

    println(sb.toString())
}