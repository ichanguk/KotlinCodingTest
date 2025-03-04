package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val nums = IntArray(100_001) { 0 }

    while (st.hasMoreTokens()) {
        nums[st.nextToken().toInt()]++
    }

    if (nums.max() > (n + 1) / 2) {
        println("NO")
    } else {
        println("YES")
    }

}