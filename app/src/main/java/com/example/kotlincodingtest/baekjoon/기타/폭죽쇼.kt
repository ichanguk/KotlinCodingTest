package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, c) = readLine().split(' ').map { it.toInt() }
    val firecracker = BooleanArray(c + 1) { false }

    repeat(n) {
        val t = readLine().toInt()
        if (!firecracker[t]) {
            for (i in t..c step t) {
                firecracker[i] = true
            }
        }
    }

    println(firecracker.count { it })
}