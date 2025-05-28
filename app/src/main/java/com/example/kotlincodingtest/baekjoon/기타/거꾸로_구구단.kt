package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val gugudan = mutableListOf<Long>()

    repeat(k) {
        gugudan.add((n * (it + 1)).toString().reversed().toLong())
    }

    gugudan.sortDescending()
    println(gugudan[0])
}