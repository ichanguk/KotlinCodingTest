package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    while (true) {
        val input = readLine()

        if (input == "EOI") {
            break
        }

        if (input.contains("Nemo", ignoreCase = true)) {
            println("Found")
        } else {
            println("Missing")
        }
    }
}