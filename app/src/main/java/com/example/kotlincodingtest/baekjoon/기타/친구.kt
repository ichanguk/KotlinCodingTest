package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    val friends = IntArray(n + 1) { 0 }

    repeat(m) {
        val (a, b) = readLine().split(' ').map { it.toInt() }

        friends[a]++
        friends[b]++
    }

    for (i in 1..n) {
        println(friends[i])
    }
}