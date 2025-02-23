package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        val sb = StringBuilder()

        for (i in 0 until n * 2) {
            if (it % 2 == 0) {
                if (i % 2 == 0) {
                    sb.append('*')
                } else {
                    sb.append(' ')
                }
            } else {
                if (i % 2 == 0) {
                    sb.append(' ')
                } else {
                    sb.append('*')
                }
            }
        }
        println(sb.toString())
    }
}