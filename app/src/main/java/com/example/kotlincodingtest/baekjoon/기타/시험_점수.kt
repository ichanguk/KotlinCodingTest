package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val s = readLine().split(' ').sumOf { it.toInt() }
    val t = readLine().split(' ').sumOf { it.toInt() }

    if (s >= t) println(s)
    else println(t)


}