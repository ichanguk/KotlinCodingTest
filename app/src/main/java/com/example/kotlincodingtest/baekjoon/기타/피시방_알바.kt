package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    val st = StringTokenizer(readLine())
    val s = mutableSetOf<Int>()

    while (st.hasMoreTokens()) {
        s.add(st.nextToken().toInt())
    }

    println(n - s.size)
}