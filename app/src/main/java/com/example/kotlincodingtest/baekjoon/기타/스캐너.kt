package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (R, C, ZR, ZC) = readLine().split(' ').map { it.toInt() }

    repeat(R) {
        val input = readLine()
        val sb = StringBuilder()

        for (c in input) {
            repeat(ZC) {
                sb.append(c)
            }
        }

        repeat(ZR) {
            println(sb.toString())
        }
    }

}