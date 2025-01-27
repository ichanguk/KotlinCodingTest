package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val h = MutableList(9) { 0 }
    repeat(9) {
        h[it] = readLine().toInt()
    }

    h.sort()
    val sum = h.sum()

    for (i in 0 until 8) {
        for (j in (i + 1) until 9) {
            if (sum - h[i] - h[j] == 100) {
                h.removeAt(j)
                h.removeAt(i)
                h.forEach {
                    println(it)
                }
                return@with
            }
        }
    }
}