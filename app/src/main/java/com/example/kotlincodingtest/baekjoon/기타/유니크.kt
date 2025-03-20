package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    val scores = Array(n) { IntArray(3) { 0 } }

    repeat(n) {
        val st = StringTokenizer(readLine())
        for (i in 0 until 3) {
            scores[it][i] = st.nextToken().toInt()
        }
    }

    val sums = IntArray(n) { 0 }

    for (j in 0 until 3) {
        val scoreBoard = IntArray(101) { 0 }
        for (i in 0 until n) {
            scoreBoard[scores[i][j]]++
        }

        for (i in 0 until n) {
            if (scoreBoard[scores[i][j]] == 1) {
                sums[i] += scores[i][j]
            }
        }
    }

    sums.forEach {
        println(it)
    }
}