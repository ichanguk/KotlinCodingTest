package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, m, M, T, R) = readLine().split(' ').map { it.toInt() }

    if (m + T > M) {
        println(-1)
        return@with
    }

    var curM = m
    var ans = 0
    var workT = 0

    while (workT < N) {
        ans++

        if (curM + T <= M) {
            curM += T
            workT++
        } else {
            curM -= R
            if (curM < m) {
                curM = m
            }
        }
    }

    println(ans)
}