package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val heights = IntArray(n) { 0 }
    repeat(n) {
        heights[it] = readLine().toInt()
    }

    var ans = 0
    var maxH = 0
    for (i in n - 1 downTo 0) {
        if (heights[i] > maxH) {
            maxH = heights[i]
            ans++
        }
    }

    println(ans)
}