package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val works = MutableList(n) { Pair(0, 0) }

    repeat(n) {
        val (t, s) = readLine().split(' ').map { it.toInt() }
        works[it] = Pair(t, s)
    }

    works.sortByDescending { it.second }

    var cur = works[0].second - works[0].first

    for (i in 1 until n) {
        if (works[i].second < cur) {
            cur = works[i].second - works[i].first
        } else {
            cur -= works[i].first
        }
    }

    if (cur < 0) {
        println(-1)
    } else {
        println(cur)
    }
}