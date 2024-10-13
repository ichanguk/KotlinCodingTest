package com.example.kotlincodingtest.baekjoon.단계별.투포인터

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val numList = readLine().split(' ').map { it.toInt() }

    var s = 0
    var e = 0
    var ans = 100_001
    var sum = numList[s]

    while (true) {
        if (sum < m) {
            e++
            if (e == n) {
                break
            }
            sum += numList[e]
        } else {
            sum -= numList[s]
            ans = minOf(ans, e - s + 1)
            s++
        }
    }

    if (ans < 100_001) println(ans) else println(0)
}