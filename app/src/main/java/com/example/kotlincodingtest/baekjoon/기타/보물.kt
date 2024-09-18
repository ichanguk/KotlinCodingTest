package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val a = readLine().split(' ').map { it.toInt() }.toMutableList()
    val b = readLine().split(' ').map { it.toInt() }.toMutableList()

    a.sort()
    b.sortDescending()

    var ans = 0

    repeat(N) {
        ans += a[it] * b[it]
    }

    println(ans)
}