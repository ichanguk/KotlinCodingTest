package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (x, y) = readLine().split(' ')

    val ans = (x.reversed().toInt() + y.reversed().toInt()).toString().reversed().toInt()
    println(ans)
}