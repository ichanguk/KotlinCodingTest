package com.example.kotlincodingtest.baekjoon.단계별.정렬

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val K = st.nextToken().toInt()

    st = StringTokenizer(readLine())
    val scores = MutableList(N) { 0 }
    for (i in 0 until N) {
        scores[i] = st.nextToken().toInt()
    }

    scores.sortDescending()

    println(scores[K - 1])
}