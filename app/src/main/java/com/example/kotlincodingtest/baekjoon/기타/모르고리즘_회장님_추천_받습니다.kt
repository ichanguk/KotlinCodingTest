package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.PriorityQueue

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    val pq = PriorityQueue<Pair<Int, String>>(compareByDescending<Pair<Int, String>> { it.first }.thenBy { it.second })
    repeat(n) {
        val (name, score) = readLine().split(' ')

        pq.add(Pair(score.toInt(), name))
    }

    println(pq.remove().second)
}