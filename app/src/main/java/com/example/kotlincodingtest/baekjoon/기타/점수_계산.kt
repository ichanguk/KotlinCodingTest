package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val score = mutableListOf<Pair<Int, Int>>()
    repeat(8) {
        score.add(Pair(it + 1, readLine().toInt()))
    }

    score.sortBy { it.second }

    var sum = 0
    for (i in 3 until 8) {
        sum += score[i].second
    }
    println(sum)
    score.drop(3).sortedBy { it.first }.forEach {
        print("${it.first} ")
    }
}