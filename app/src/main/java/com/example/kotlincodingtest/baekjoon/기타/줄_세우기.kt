package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())

    val ans = mutableListOf<Int>()

    var idx = 1
    while (st.hasMoreTokens()) {
        ans.add(ans.size - st.nextToken().toInt(), idx++)
    }

    ans.forEach {
        print("$it ")
    }
    println()

}