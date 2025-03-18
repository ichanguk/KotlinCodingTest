package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val input = readLine()

    val sb = StringBuilder()
    val vowels = setOf('a', 'e', 'i', 'o', 'u')

    var i = 0
    while (i < input.length) {
        sb.append(input[i])
        if (vowels.contains(input[i])) {
            i += 3
        } else {
            i++
        }
    }

    println(sb.toString())
}