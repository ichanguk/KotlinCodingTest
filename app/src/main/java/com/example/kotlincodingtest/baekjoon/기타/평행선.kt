package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val xMap = mutableMapOf<Int, Int>()
    val yMap = mutableMapOf<Int, Int>()

    repeat(n) {
        val (x, y) = readLine().split(' ').map { it.toInt() }

        xMap[x] = xMap.getOrDefault(x, 0) + 1
        yMap[y] = yMap.getOrDefault(y, 0) + 1
    }

    println(xMap.filter { it.value >= 2 }.count() + yMap.filter { it.value >= 2 }.count())
}