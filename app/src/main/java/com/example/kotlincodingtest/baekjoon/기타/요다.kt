package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        val words = readLine().split(' ')

        for (i in 2 until words.size) {
            print(words[i] + " ")
        }

        println(words[0] + " " + words[1])
    }
}