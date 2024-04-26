package com.example.kotlincodingtest.baekjoon.단계별.정렬

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val members = MutableList<Pair<Int, String>>(N) { Pair(0, "")}

    var st:StringTokenizer? = null

    for (i in 0 until N) {
        st = StringTokenizer(readLine())
        members[i] = Pair(st.nextToken().toInt(), st.nextToken())
    }

    members.sortBy { it.first }

    members.forEach {
        print(it.first)
        println(" " + it.second)
    }
}