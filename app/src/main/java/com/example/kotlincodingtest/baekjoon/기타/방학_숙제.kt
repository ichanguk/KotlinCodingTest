package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val L = readLine().toInt()
    val A = readLine().toInt()
    val B = readLine().toInt()
    val C = readLine().toInt()
    val D = readLine().toInt()

    val cntA = if (A % C == 0) A / C else A / C + 1
    val cntB = if (B % D == 0) B / D else B / D + 1

    println(L - maxOf(cntA, cntB))
}