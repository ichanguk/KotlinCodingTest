package com.example.kotlincodingtest.baekjoon.단계별.누적합

import java.io.BufferedReader
import java.io.BufferedWriter

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val numList = MutableList(N + 1) { List(N) { 0 } }

    for (i in 1..N) {
        numList[i] = readLine().split(' ').map { it.toInt() }
    }

    val sumList = MutableList(N + 1) { MutableList(N + 1) { 0 } }
    for (i in 1..N) {
        for (j in 1..N) {
            sumList[i][j] = sumList[i][j - 1] - sumList[i -1][j - 1] + sumList[i - 1][j] + numList[i][j - 1]
        }
    }

    val bw = BufferedWriter(System.out.bufferedWriter())
    for (i in 1..M) {
        val (x1, y1, x2, y2) = readLine().split(' ').map { it.toInt() }
        bw.write("${sumList[x2][y2] - sumList[x2][y1 - 1] - sumList[x1 - 1][y2] + sumList[x1 - 1][y1 - 1]}\n")
    }
    bw.flush()
    bw.close()

}