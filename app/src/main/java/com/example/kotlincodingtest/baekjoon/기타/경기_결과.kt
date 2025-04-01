package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    var aCnt = 0
    var bCnt = 0
    repeat(n) {
        val (a, b) = readLine().split(' ').map { it.toInt() }

        if (a > b) {
            aCnt++
        } else if (a < b) {
            bCnt++
        }
    }

    println("$aCnt $bCnt")
}