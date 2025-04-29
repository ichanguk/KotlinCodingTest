package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    while (true) {
        val input = readLine()
        if (input == "*") {
            break
        }
        val alpha = mutableSetOf<Char>()

        input.forEach {
            if (it != ' ') {
                alpha.add(it)
            }
        }

        if (alpha.size == 26) {
            println('Y')
        } else {
            println('N')
        }
    }
}