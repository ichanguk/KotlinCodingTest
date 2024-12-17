package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var input = readLine()

    while (input != "#") {
        val c = input[0]
        val lowerInput = input.substring(2, input.length).lowercase()

        println("$c ${lowerInput.count { it == c }}")
        input = readLine()
    }
}