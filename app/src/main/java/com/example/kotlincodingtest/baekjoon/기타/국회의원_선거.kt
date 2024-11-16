package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.PriorityQueue

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    var cur = readLine().toInt()
    var ans = 0

    val pq = PriorityQueue<Int>(compareByDescending{it})

    repeat(n - 1) {
        pq.add(readLine().toInt())
    }

    while (pq.isNotEmpty() && cur <= pq.first()) {
        pq.add(pq.remove() - 1)
        ans++
        cur++
    }
    println(ans)
}