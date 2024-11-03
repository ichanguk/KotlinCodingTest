package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (g, s) = readLine().split(' ').map { it.toInt() }
    val a = readLine()
    val b = readLine()

    val aMap = mutableMapOf<Char, Int>()

    a.forEach {
        aMap[it] = aMap.getOrDefault(it, 0) + 1
    }

    val bMap = mutableMapOf<Char, Int>()

    for (i in 0 until g - 1) {
        bMap[b[i]] = bMap.getOrDefault(b[i], 0) + 1
    }

    var ans = 0

    for (i in g - 1 until s) {
        bMap[b[i]] = bMap.getOrDefault(b[i], 0) + 1
        if (aMap == bMap) {
            ans++
        }

        bMap[b[i - g + 1]] = bMap[b[i - g + 1]]!! - 1

        if (bMap[b[i - g + 1]] == 0) {
            bMap.remove(b[i - g + 1])
        }
    }

    println(ans)
}
