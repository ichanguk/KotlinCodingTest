package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        if ((readLine().last() - '0') % 2 == 0) {
            println("even")
        } else {
            println("odd")
        }
    }
}