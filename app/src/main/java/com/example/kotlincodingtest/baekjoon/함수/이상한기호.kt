package com.example.kotlincodingtest.baekjoon.함수

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    println(aAtB(st.nextToken().toLong(), st.nextToken().toLong()))
}

fun aAtB(a: Long, b: Long) :Long{
    return (a + b) * (a - b)
}

