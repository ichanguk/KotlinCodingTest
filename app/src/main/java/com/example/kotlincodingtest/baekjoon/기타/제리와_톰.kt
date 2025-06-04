package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val num = readLine().split(' ').map { it.toInt() }

    println("${num[1] - num[0]} ${num[1]}")

}