package com.example.kotlincodingtest.baekjoon.단계별.백트래킹

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

private var N = 0
private var M = 0
private val bw = BufferedWriter(System.out.bufferedWriter())
private val s = mutableListOf<Int>()

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    N = st.nextToken().toInt()
    M = st.nextToken().toInt()
    dfs()
    bw.flush()
    bw.close()
}

private fun dfs() {
    if (s.size == M) {
        s.forEach {
            bw.write("$it ")
        }
        bw.newLine()
        return
    }
    for (i in 1..N) {
        s.add(i)
        dfs()
        s.removeAt(s.size - 1)
    }
}