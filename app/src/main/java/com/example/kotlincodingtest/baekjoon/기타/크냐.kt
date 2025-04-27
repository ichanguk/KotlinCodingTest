package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    while(true) {
        val (a, b) = readLine().split(' ').map { it.toInt() }

        if (a == 0 && b == 0) {
            break
        }
        if (a > b) {
            println("Yes")
        } else {
            println("No")
        }
    }
}