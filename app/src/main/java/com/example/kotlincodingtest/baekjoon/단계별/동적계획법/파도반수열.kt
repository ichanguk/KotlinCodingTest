package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val p = MutableList<Long>(101){0}
    p[1] = 1
    p[2] = 1
    p[3] = 1
    p[4] = 2
    p[5] = 2
    p[6] = 3
    p[7] = 4
    p[8] = 5
    for (i in 9..100) {
        p[i] = p[i - 1] + p[i - 5]
    }
    for (i in 1..N) {
        println(p[readLine().toInt()])
    }
}