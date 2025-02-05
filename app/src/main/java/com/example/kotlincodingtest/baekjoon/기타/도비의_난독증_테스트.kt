package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.PriorityQueue

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var n = readLine().toInt()

    while (n != 0) {
        val pq = PriorityQueue<String> (compareBy { it.uppercase() })
        repeat(n) {
            pq.add(readLine())
        }
        println(pq.remove())

        n = readLine().toInt()
    }
}