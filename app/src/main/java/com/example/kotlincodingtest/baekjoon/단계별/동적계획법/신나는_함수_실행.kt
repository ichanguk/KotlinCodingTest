package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader
import java.util.StringTokenizer

private var dp = MutableList(21) { MutableList(21) { MutableList<Long>(21) { 1 } } }

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var st = StringTokenizer(readLine())
    var a = st.nextToken().toInt()
    var b = st.nextToken().toInt()
    var c = st.nextToken().toInt()

    w()
    while (a != -1 || b != -1 || c != -1) {
        if (a <= 0 || b <= 0 || c <= 0) {
            println("w($a, $b, $c) = 1")
        } else if (a > 20 || b > 20 || c > 20) {
            println("w($a, $b, $c) = ${dp[20][20][20]}")
        } else {
            println("w($a, $b, $c) = ${dp[a][b][c]}")
        }
        st = StringTokenizer(readLine())
        a = st.nextToken().toInt()
        b = st.nextToken().toInt()
        c = st.nextToken().toInt()
    }
}

fun w() {
    for (i in 1..20) {
        for (j in 1..20) {
            for (k in 1..20) {
                if (j in (i + 1)..<k) {
                    dp[i][j][k] = dp[i][j][k - 1] + dp[i][j - 1][k - 1] - dp[i][j - 1][k]
                } else {
                    dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k] + dp[i - 1][j][k - 1] - dp[i - 1][j - 1][k - 1]
                }
            }
        }
    }
}