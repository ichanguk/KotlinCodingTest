package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val input = readLine()
    var ans = 10

    var prev = input[0]
    for (i in 1 until input.length) {
        if (prev == input[i]) {
            ans += 5
        } else {
            prev = input[i]
            ans += 10
        }
    }
    println(ans)

}