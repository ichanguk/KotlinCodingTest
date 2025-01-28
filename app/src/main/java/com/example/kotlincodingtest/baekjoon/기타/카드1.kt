package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val dq = ArrayDeque<Int>()
    repeat(n) {
        dq.addLast(it + 1)
    }

    while (dq.size > 1) {
        print("${dq.removeFirst()} ")
        dq.addLast(dq.removeFirst())
    }

    println(dq.removeFirst())
}