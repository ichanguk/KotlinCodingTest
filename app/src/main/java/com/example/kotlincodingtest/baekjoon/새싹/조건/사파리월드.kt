package com.example.kotlincodingtest.baekjoon.새싹.조건

import java.io.BufferedReader
import java.util.StringTokenizer
// import kotlin.math.abs

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    val N = st.nextToken().toLong()
    val M = st.nextToken().toLong()

    if (N > M) {
        println(N - M)
    } else {
        println(M - N)
    }

    //println(abs(N - M))
}