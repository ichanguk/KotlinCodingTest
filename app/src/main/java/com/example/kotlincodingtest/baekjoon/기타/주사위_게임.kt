package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    var score1 = 100
    var score2 = 100

    repeat(n) {
        val (a, b) = readLine().split(' ').map { it.toInt() }

        if (a < b) {
            score1 -= b
        } else if (b < a) {
            score2 -= a
        }
    }
    println(score1)
    println(score2)

}