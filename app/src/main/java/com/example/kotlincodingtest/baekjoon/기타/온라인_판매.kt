package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var (n, m) = readLine().split(' ').map { it.toInt() }
    val prices = IntArray(m) { 0 }

    repeat(m) {
        prices[it] = readLine().toInt()
    }

    prices.sortDescending()

    var cnt = 1
    var cur = prices[0]

    if (n > m) {
        n = m
    }

    for (i in 1 until n) {
        if (prices[i] * (i + 1) >= cnt * cur) {
            cnt = i + 1
            cur = prices[i]
        }
    }

    println("$cur ${cur * cnt}")
}