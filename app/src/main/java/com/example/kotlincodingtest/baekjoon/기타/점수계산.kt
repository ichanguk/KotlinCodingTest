package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())

    var cur = 0
    var ans = 0
    while (st.hasMoreTokens()) {
        if (st.nextToken().toInt() == 1) {
            ans += ++cur
        } else {
            cur = 0
        }
    }
    println(ans)
}