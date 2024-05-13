package com.example.kotlincodingtest.baekjoon.단계별.누적합

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val numList = readLine().split(' ').map { it.toInt() }
    val sumList = MutableList(N + 1) { 0 }

    val remainList = MutableList(M) { 0L }
    for (i in 1..N) {
        sumList[i] = (sumList[i - 1] + numList[i - 1]) % M
        remainList[sumList[i]]++
    }

    var res = 0L
    for (i in 0 until M) {
        if (remainList[i] >= 2) {
            res += (remainList[i] * (remainList[i] - 1)) / 2
        }
    }

    res += remainList[0]
    println(res)

}