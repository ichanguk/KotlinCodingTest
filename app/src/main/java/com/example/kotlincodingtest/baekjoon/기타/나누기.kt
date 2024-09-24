package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt() / 100 * 100
    val f = readLine().toInt()

    for (i in 0 until 100) {
        if ((N + i) % f == 0) {
            if (i < 10) {
                println("0$i")
            } else {
                println(i)
            }
            break
        }
    }
}