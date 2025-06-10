package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    var flag = false
    repeat(n) {
        if (readLine().equals("anj")) {
            flag = true
        }
    }
    if (flag) {
        println("뭐야;")
    } else {
        println("뭐야?")
    }
}