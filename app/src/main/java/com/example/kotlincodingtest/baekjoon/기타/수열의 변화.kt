package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val ans = readLine().split(',').map { it.toInt() }.toMutableList()

    repeat(k) {
        for (i in 0 until n - 1) {
            ans[i] = ans[i + 1] - ans[i]
        }
    }

    val st = StringBuilder()
    for (i in 0 until n - k) {
        st.append(ans[i])
        st.append(',')
    }
    st.deleteAt(st.length - 1)

    println(st.toString())
}