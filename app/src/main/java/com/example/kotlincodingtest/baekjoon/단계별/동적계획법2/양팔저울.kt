package com.example.kotlincodingtest.baekjoon.단계별.동적계획법2

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val beads = readLine().split(' ').map { it.toInt() }
    val wMax = beads.sum()

    val dp = BooleanArray(40001) { false }

    dp[0] = true
    for (i in 0 until N) {
        for (j in wMax downTo 0) {
            if (dp[j]) {
                dp[j + beads[i]] = true
            }
        }
        for (j in 0 until wMax) {
            if (dp[j]) {
                dp[abs(j - beads[i])] = true
            }
        }
    }

    val M = readLine().toInt()
    val st = StringTokenizer(readLine())
    repeat(M) {
        if (dp[st.nextToken().toInt()]) {
            print("Y ")
        } else {
            print("N ")
        }
    }
    println()
}