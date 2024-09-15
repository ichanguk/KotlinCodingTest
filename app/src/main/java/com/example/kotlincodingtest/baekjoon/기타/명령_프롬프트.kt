package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val answer = readLine().toCharArray()
    repeat(N - 1) {
        val input = readLine()

        for (i in answer.indices) {
            if (answer[i] != input[i]) {
                answer[i] = '?'
            }
        }
    }

    println(answer)
}