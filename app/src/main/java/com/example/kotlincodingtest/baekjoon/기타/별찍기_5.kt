package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        val sb = StringBuilder()

        repeat(n - it - 1) {
            sb.append(' ')
        }

        repeat(2 * it + 1) {
            sb.append('*')
        }
        println(sb.toString())
    }
}