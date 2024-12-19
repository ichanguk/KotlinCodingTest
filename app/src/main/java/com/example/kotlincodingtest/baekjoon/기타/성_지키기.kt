package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val rows = BooleanArray(n) { false }
    val cols = BooleanArray(m) { false }

    val castle = Array(n) {""}

    repeat(n) {
        castle[it] = readLine()
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (castle[i][j] == 'X') {
                rows[i] = true
                cols[j] = true
            }
        }
    }

    val rowCount = rows.count { it == false }
    val colCount = cols.count { it == false }

    println("${rowCount + colCount - minOf(rowCount, colCount)}")
}