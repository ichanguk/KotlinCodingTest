package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        repeat(n - n / 2) {
            print("* ")
        }
        println()
        repeat(n / 2) {
            print(" *")
        }
        println()
    }
}