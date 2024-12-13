package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val g = Array(n) { "" }

    repeat(n) {
        g[it] = readLine()
    }

    val isVisit = Array(n) { BooleanArray(m) { false } }

    var ans = 0

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (!isVisit[i][j]) {
                ans++
                if (g[i][j] == '-') {
                    for (k in (j + 1) until m) {
                        if (g[i][k] == '-') {
                            isVisit[i][k] = true
                        } else {
                            break
                        }
                    }
                } else {
                    for (k in (i + 1) until n) {
                        if (g[k][j] == '|') {
                            isVisit[k][j] = true
                        } else {
                            break
                        }
                    }
                }
            }
        }
    }

    println(ans)
}