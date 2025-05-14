package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        val input = readLine()
        var score = 0

        input.forEach {
            if (it != ' ') {
                score += it - 'A' + 1
            }
        }

        if (score == 100) {
            println("PERFECT LIFE")
        } else {
            println(score)
        }
    }
}