package com.example.kotlincodingtest.baekjoon.단계별.일반수학1

import java.util.*
import java.io.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    val N = st.nextToken().reversed()
    val B = st.nextToken().toDouble()

    var res:Int = 0

    for (i in 0 until N.length) {
        if (N[i].isLetter()) {
            res += (N[i] - 'A' + 10) * Math.pow(B, i.toDouble()).toInt()
        } else {
            res += (N[i] - '0') * Math.pow(B, i.toDouble()).toInt()
        }
    }

    println(res)
}