package com.example.kotlincodingtest.baekjoon

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    var ans = 0
    repeat(n) {
        val input = readLine().drop(2).toInt()

        if (input <= 90) {
            ans++
        }
    }
    println(ans)
}