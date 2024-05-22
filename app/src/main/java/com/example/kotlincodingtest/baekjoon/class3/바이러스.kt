package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val warmList = MutableList<Boolean>(N + 1) { false }
    warmList[1] = true

    val M = readLine().toInt()
    val linkList = MutableList(M) { Pair(0, 0) }
    var st:StringTokenizer
    for (i in 0 until M) {
        st = StringTokenizer(readLine())
        linkList[i] = Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }

    val q = ArrayDeque<Int>()
    q.add(1)

    var cnt = 0
    while (q.isNotEmpty()) {
        q.removeFirst()
        cnt++

        for (i in 0 until M) {
            if (warmList[linkList[i].first] && !warmList[linkList[i].second]) {
                warmList[linkList[i].second] = true
                q.addLast(linkList[i].second)
            } else if (warmList[linkList[i].second] && !warmList[linkList[i].first]) {
                warmList[linkList[i].first] = true
                q.addLast(linkList[i].first)
            }
        }
    }
    println(cnt - 1)

}