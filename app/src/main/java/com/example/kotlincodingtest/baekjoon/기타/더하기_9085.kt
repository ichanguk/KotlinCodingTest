package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val t = readLine().toInt()

    repeat(t) {
        val n = readLine().toInt()

        println(readLine().split(' ').map { it.toInt() }.sum())
    }
}