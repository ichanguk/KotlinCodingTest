package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, l) = readLine().split(' ').map { it.toInt() }
    val places = readLine().split(' ').map { it.toInt() }.sorted()

    var ans = 1

    var cur = places[0]

    for (i in 1 until n) {
        if (places[i] > cur + l - 1) {
            ans++
            cur = places[i]
        }
    }

    println(ans)
}