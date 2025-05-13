package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val input = readLine()

    val ans = StringBuilder()

    val mbti1 = charArrayOf('E', 'S', 'T', 'J')
    val mbti2 = charArrayOf('I', 'N', 'F', 'P')

    for (i in 0 until 4) {
        if (input[i] == mbti1[i]) {
            ans.append(mbti2[i])
        } else {
            ans.append(mbti1[i])
        }
    }

    println(ans.toString())

}