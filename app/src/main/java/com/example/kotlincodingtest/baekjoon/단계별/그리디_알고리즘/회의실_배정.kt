package com.example.kotlincodingtest.baekjoon.단계별.그리디_알고리즘

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val timeTable = MutableList(N) { Pair(0, 0) }
    var st:StringTokenizer
    for (i in 0 until N) {
        st = StringTokenizer(readLine())
        timeTable[i] = Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }

    timeTable.sortWith (
        compareBy<Pair<Int, Int>> {
            it.second
        }.thenBy {
            it.first
        }
    )
    var res = 1
    var cur = timeTable[0].second
    for (i in 1 until N) {
        if (timeTable[i].first >= cur) {
            cur = timeTable[i].second
            res++
        }
    }
    println(res)
}