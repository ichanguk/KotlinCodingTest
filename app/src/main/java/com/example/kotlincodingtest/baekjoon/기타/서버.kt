package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, T) = readLine().split(' ').map { it.toInt() }

    val st = StringTokenizer(readLine())

    var cur = T
    var cnt = 0
    while (st.hasMoreTokens()) {
        cur -= st.nextToken().toInt()
        if (cur >= 0) {
            cnt++
        } else {
            break
        }
    }

    println(cnt)
}