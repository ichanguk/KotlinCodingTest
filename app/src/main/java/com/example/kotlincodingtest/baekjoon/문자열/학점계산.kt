package com.example.kotlincodingtest.baekjoon.문자열

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val grade = readLine()

    val scoreMap = mapOf(
        "A+" to 4.3, "A0" to 4.0, "A-" to 3.7,
        "B+" to 3.3, "B0" to 3.0, "B-" to 2.7,
        "C+" to 2.3, "C0" to 2.0, "C-" to 1.7,
        "D+" to 1.3, "D0" to 1.0, "D-" to 0.7,
        "F" to 0.0
        )

    println(scoreMap[grade])
}