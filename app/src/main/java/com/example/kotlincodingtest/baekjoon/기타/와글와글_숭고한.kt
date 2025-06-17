package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (s, k, h) = readLine().split(' ').map { it.toInt() }

    if (h + s + k >= 100) {
        println("OK")
    } else {
        if (h < s && h < k) {
            println("Hanyang")
        } else if (s < k) {
            println("Soongsil")
        } else {
            println("Korea")
        }
    }
}