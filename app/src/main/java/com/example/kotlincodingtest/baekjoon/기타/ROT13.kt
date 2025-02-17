package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val input = readLine()
    val sb = StringBuilder()

    for (c in input) {
        if (c.isLetter()) {
            if (c in 'a' until 'a' + 13 || c in 'A' until 'A' + 13) {
                sb.append(c + 13)
            } else {
                sb.append(c - 13)
            }
        } else {
            sb.append(c)
        }
    }
    println(sb.toString())
}