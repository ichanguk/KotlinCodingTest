package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = readLine().toInt()
    val d = readLine().toInt()

    val sum = a + b + c + d

    println(sum / 60)
    println(sum % 60)
}