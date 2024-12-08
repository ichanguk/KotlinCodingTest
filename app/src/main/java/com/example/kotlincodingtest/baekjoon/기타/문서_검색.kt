package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val input = readLine()
    val word = readLine()

    var s = 0
    var ans = 0
    while (s < input.length) {
        val idx = input.substring(s, input.length).indexOf(word)
        if (idx >= 0) {
            ans++
            s += idx + word.length
        } else {
            break
        }
    }

    println(ans)
}