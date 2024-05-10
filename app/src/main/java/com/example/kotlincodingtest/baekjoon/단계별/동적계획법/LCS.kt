package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader
import java.io.BufferedWriter
import kotlin.math.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val seq1 = readLine()
    val seq2 = readLine()

    val maxLen = min(seq1.length, seq2.length)

    val dp = MutableList(seq2.length + 1) { MutableList(seq1.length + 1) { 0 } }
    val bw = BufferedWriter(System.out.bufferedWriter())

    for (i in 1..seq2.length) {
        for (j in 1.. seq1.length) {
            if (seq2[i - 1] == seq1[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
            } else {
                dp[i][j] = max(dp[i][j - 1], dp[i - 1][j])
            }
        }
    }

    bw.write("${dp[seq2.length][seq1.length]}")
    bw.flush()
    bw.close()
}