package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val ropes = MutableList(n) { 0 }

    repeat(n) {
        ropes[it] = readLine().toInt()
    }

    ropes.sortDescending()

    var ans = 0

    for(i in 0 until n) {
        if ((i + 1) * ropes[i] > ans) {
            ans = (i + 1) * ropes[i]
        }
    }

    println(ans)
}