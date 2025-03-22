package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var ans = readLine().toInt()

    repeat(9) {
        ans -= readLine().toInt()
    }

    println(ans)
}