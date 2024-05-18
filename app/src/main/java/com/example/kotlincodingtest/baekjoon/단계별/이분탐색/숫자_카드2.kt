package com.example.kotlincodingtest.baekjoon.단계별.이분탐색

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val numMap = mutableMapOf<Int, Int>()
    val st = StringTokenizer(readLine())
    var cur = 0
    for (i in 0 until N) {
        cur = st.nextToken().toInt()
        numMap[cur] = numMap.getOrDefault(cur, 0) + 1
    }

    val M = readLine().toInt()
    val nums = readLine().split(' ').map { it.toInt() }
    val bw = BufferedWriter(System.out.bufferedWriter())

    nums.forEach {
        bw.write("${numMap.getOrDefault(it, 0)} ")
    }
    bw.flush()
    bw.close()
}