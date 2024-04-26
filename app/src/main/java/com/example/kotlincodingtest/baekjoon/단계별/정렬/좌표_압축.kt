package com.example.kotlincodingtest.baekjoon.단계별.정렬

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    var points = MutableList<Pair<Int, Int>>(N) { Pair(0, 0) }

    val st = StringTokenizer(readLine())
    for (i in 0 until N) {
        points[i] = Pair(i, st.nextToken().toInt())
    }
    points.sortBy { it.second }

    var curX = points[0].second
    var curXI = 0
    points[0] = Pair(points[0].first, curXI)



    for (i in 1 until N) {
        if (points[i].second > curX) {
            curX = points[i].second
            curXI++
        }
        points[i] = Pair(points[i].first, curXI)
    }

    points.sortBy { it.first }

    val bw = BufferedWriter(System.out.bufferedWriter())
    points.forEach {
        bw.write("${it.second} ")
    }
    bw.flush()
    bw.close()
}