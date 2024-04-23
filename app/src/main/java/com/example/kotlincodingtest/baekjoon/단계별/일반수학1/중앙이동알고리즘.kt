package com.example.kotlincodingtest.baekjoon.단계별.일반수학1

import java.io.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toDouble()
    val pointsPerLine = Math.sqrt(Math.pow(4.0, N)).toInt() + 1
    println(pointsPerLine * pointsPerLine)

}