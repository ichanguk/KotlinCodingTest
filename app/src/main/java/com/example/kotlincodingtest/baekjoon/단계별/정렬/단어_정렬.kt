package com.example.kotlincodingtest.baekjoon.단계별.정렬

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    var words = MutableList<String>(N) { "" }

    for (i in 0 until N) {
        words[i] = readLine()
    }

    words = words.distinct().toMutableList()
    words.sortWith(
        compareBy<String> {
            it.length
        }.thenBy {
            it
        }
    )

    words.forEach {
        println(it)
    }
}