package com.example.kotlincodingtest.baekjoon.입력과계산

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    val A = st.nextToken().toLong()
    val B = st.nextToken().toLong()
    val C = st.nextToken().toLong()

    println(A + B + C)
}