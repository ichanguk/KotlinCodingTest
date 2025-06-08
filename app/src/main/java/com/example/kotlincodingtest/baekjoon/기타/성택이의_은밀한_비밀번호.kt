package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        if (readLine().length in 6..9) {
            println("yes")
        } else {
            println("no")
        }
    }
}