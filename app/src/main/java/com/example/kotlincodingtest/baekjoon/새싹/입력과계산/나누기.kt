package com.example.kotlincodingtest.baekjoon.새싹.입력과계산

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    val A = st.nextToken().toDouble()
    val B = st.nextToken().toInt()

    println(A / B)
}