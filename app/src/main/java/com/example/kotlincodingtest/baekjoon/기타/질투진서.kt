package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, a, b) = readLine().split(' ').map { it.toInt() }

    val scores = Array(n) { IntArray(n) { 0 } }

    for (i in 0 until n) {
        val st = StringTokenizer(readLine())
        for (j in 0 until n) {
            scores[i][j] = st.nextToken().toInt()
        }
    }

    val myScore = scores[a - 1][b - 1]

    for (i in 0 until n) {
        if (scores[a - 1][i] > myScore) {
            println("ANGRY")
            return@with
        }
    }

    for (i in 0 until n) {
        if (scores[i][b - 1] > myScore) {
            println("ANGRY")
            return@with
        }
    }

    println("HAPPY")
}