package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var ans = 0

    repeat(readLine().toInt()) {
        val name = readLine()

        if (name.first() == 'C') {
            ans++
        }
    }

    println(ans)
}