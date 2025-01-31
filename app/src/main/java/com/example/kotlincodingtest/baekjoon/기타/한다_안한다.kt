package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    repeat(n) {
        val input = readLine()

        if (input[input.length / 2 - 1] == input[input.length / 2]) {
            println("Do-it")
        } else {
            println("Do-it-Not")
        }
    }
}