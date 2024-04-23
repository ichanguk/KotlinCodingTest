package com.example.kotlincodingtest.baekjoon.단계별.일반수학1

import java.io.*
import java.util.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    var N = st.nextToken().toInt()
    val B = st.nextToken().toInt()
    var sb = StringBuilder()
    var r: Int = 0

    while (N > 0) {
        r = N % B
        if (r >= 10) {
            sb.append('A' + r - 10)
        } else {
            sb.append('0' + r)
        }
        N /= B
    }

    println(sb.reverse().toString())

}