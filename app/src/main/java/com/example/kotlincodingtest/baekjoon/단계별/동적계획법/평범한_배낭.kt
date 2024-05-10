package com.example.kotlincodingtest.baekjoon.단계별.동적계획법

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, K) = readLine().split(' ').map { it.toInt() }

    val dp = MutableList(N + 1) { MutableList(K + 1) { 0 } }
    val goods = MutableList(N) { Pair(0, 0) }

    var st: StringTokenizer? = null
    for (i in 0 until N) {
        st = StringTokenizer(readLine())
        goods[i] = Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }


    for (i in 1..N) {
        for (j in 1..K) {
            if (goods[i - 1].first <= j) {
                dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - goods[i - 1].first] + goods[i - 1].second)
            } else {
                dp[i][j] = dp[i - 1][j]
            }
        }
    }

    println(dp[N][K])
}