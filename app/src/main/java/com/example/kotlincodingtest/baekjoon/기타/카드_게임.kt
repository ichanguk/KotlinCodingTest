package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var sum = 0
    repeat(5) {
        sum += readLine().toInt()
    }

    println(sum)
}