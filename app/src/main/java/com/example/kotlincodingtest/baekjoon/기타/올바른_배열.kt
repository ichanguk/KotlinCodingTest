package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val arr = IntArray(N) { 0 }
    var ans = 4

    repeat(N) {
        arr[it] = readLine().toInt()
    }

    arr.sort()

    for (i in 0 until N) {
        for (j in (N - 1) downTo (i + 1)) {
            if (arr[j] - arr[i] <= 4) {
                ans = minOf(ans, 4 - (j - i))
                break
            }
        }
    }

    println(ans)
}