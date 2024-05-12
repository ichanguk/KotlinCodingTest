package com.example.kotlincodingtest.baekjoon.단계별.누적합

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val S = readLine()

    val dp = MutableList(27) { MutableList(S.length + 1) { 0 } }
    val N = readLine().toInt()
    for (i in 1..26) {
        for (j in 1..S.length) {
            if (S[j - 1] == 'a' + i - 1) {
                dp[i][j] = dp[i][j - 1] + 1
            } else {
                dp[i][j] = dp[i][j - 1]
            }
        }
    }

    val bw = BufferedWriter(System.out.bufferedWriter())
    var st:StringTokenizer
    var c:Int
    var s:Int
    var e:Int
    for (i in 1..N) {
        st = StringTokenizer(readLine())
        c = st.nextToken()[0] - 'a' + 1
        s = st.nextToken().toInt()
        e = st.nextToken().toInt()

        bw.write("${dp[c][e + 1] - dp[c][s]}\n")
    }

    bw.flush()
    bw.close()

}