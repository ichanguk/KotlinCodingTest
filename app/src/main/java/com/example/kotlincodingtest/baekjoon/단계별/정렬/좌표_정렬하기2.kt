package com.example.kotlincodingtest.baekjoon.단계별.정렬

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val points = MutableList<Pair<Int, Int>>(N){Pair(0,0)}

    for (i in 0 until N) {
        val (x, y) = readLine().split(' ').map { it.toInt() }
        points[i] = Pair(x, y)
    }

    points.sortWith(
        compareBy<Pair<Int,Int>> {
            it.second
        }.thenBy {
            it.first
        }
    )

    points.forEach {
        println("${it.first} ${it.second}")
    }

}