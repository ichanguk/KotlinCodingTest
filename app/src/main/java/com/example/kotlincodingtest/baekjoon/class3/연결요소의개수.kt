package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }

    val linkList = MutableList(M) { Pair(0, 0) }

    var st: StringTokenizer
    for (i in 0 until M) {
        st = StringTokenizer(readLine())
        linkList[i] = Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }

    var cnt = 1
    val q = ArrayDeque<Int>()
    q.addLast(1)
    val isVisit = MutableList(N + 1) { false }
    isVisit[0] = true
    isVisit[1] = true

    linkList.forEach {
        if (isVisit[it.first] && !isVisit[it.second]) {
            isVisit[it.second] = true
        } else if (!isVisit[it.first] && isVisit[it.second]) {
            isVisit[it.first] = true
        }
    }

    for (i in (M - 1) downTo 0) {
        if (isVisit[linkList[i].first] && !isVisit[linkList[i].second]) {
            isVisit[linkList[i].second] = true
        } else if (!isVisit[linkList[i].first] && isVisit[linkList[i].second]) {
            isVisit[linkList[i].first] = true
        }
    }
    while (q.isNotEmpty()) {
        q.removeFirst()

        linkList.forEach {
            if (!isVisit[it.second] && !isVisit[it.first]) {
                cnt++
                q.addLast(it.first)
                q.addLast(it.second)
            }
            isVisit[it.first] = true
            isVisit[it.second] = true
        }
    }

    isVisit.forEach {
        if (!it) {
            cnt++
        }
    }
    println(cnt)
}
