package com.example.kotlincodingtest.baekjoon.단계별.백트래킹

import java.io.BufferedReader
import java.util.StringTokenizer

private var N = 0
private var M = 0
private val s = mutableListOf<Int>()
private var isVisit = mutableListOf<Boolean>()

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    N = st.nextToken().toInt()
    M = st.nextToken().toInt()
    isVisit = MutableList<Boolean>(N + 1){false}

    dfs()
}

private fun dfs() {
    if (s.size == M) {
        s.forEach {
            print("$it ")
        }
        println()
        return
    }
    for (i in 1..N) {
        if (isVisit[i]) {
            continue
        }
        isVisit[i] = true
        s.add(i)
        dfs()
        s.removeAt(s.size - 1)
        isVisit[i] = false
    }
}
