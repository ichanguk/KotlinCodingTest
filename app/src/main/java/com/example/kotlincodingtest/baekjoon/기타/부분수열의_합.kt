package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader


fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, s) = readLine().split(' ').map { it.toInt() }
    val numList = readLine().split(' ').map { it.toInt() }

    solve(0, 0, n, s, numList)
    if (s == 0) {
        cnt--
    }
    println(cnt)
}

private var cnt = 0
private fun solve(idx: Int, sum: Int, n: Int, s: Int, numList: List<Int>) {
    if (idx == n) {
        if (sum == s) {
            cnt++
        }
        return
    }

    solve(idx + 1, sum, n, s, numList)
    solve(idx + 1, sum + numList[idx], n, s, numList)
}