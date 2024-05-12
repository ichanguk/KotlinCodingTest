package com.example.kotlincodingtest.baekjoon.단계별.누적합

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val nums = MutableList(N + 1) { 0 }

    var st = StringTokenizer(readLine())
    for (i in 1..N) {
        nums[i] = st.nextToken().toInt()
    }

    val sums = MutableList(N + 1) { 0 }

    for (i in 1 .. N) {
        sums[i] = sums[i - 1] + nums[i]
    }

    val bw = BufferedWriter(System.out.bufferedWriter())
    for (i in 1..M) {
        val (s, e) = readLine().split(' ').map { it.toInt() }
        bw.write("${sums[e] - sums[s - 1]}\n")
    }
    bw.flush()
    bw.close()

}