package com.example.kotlincodingtest.baekjoon.단계별.심화2

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val realDivisorCnt = readLine().toInt()
    val st = StringTokenizer(readLine())

    val divisors = MutableList<Int>(realDivisorCnt) { 0 }
    for (i in divisors.indices) {
        divisors[i] = st.nextToken().toInt()
    }

    divisors.sort()
    println(divisors[0] * divisors[realDivisorCnt - 1])
}