package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        val (c, v) = readLine().split(' ').map { it.toInt() }

        println("You get ${c / v} piece(s) and your dad gets ${c % v} piece(s).")
    }
}