package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    var cur = 0
    val s = mutableSetOf(0)
    for (i in 1..n) {
        cur -= i
        if (cur < 0 || s.contains(cur)) {
           cur += 2 * i
        }
        s.add(cur)
    }

    println(cur)
}