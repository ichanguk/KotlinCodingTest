package com.example.kotlincodingtest.baekjoon.단계별.백트래킹

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

private var N = 0
private var M = 0
private val s = mutableListOf<Int>()
private var isVisit = mutableListOf<Boolean>()
private val bw = BufferedWriter(System.out.bufferedWriter())
fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    N = st.nextToken().toInt()
    M = st.nextToken().toInt()
    isVisit = MutableList<Boolean>(N + 1) { false }
    dfs(1)
    bw.flush()
    bw.close()
}

private fun dfs(startNum: Int) {
    if (s.size == M) {
        s.forEach {
            bw.write("$it ")
        }
        bw.newLine()
        return
    }
    for (i in startNum..N) {
        if (isVisit[i]) {
            continue
        }
        isVisit[i] = true
        s.add(i)
        dfs(i + 1)
        s.removeAt(s.size - 1)
        isVisit[i] = false
    }
}