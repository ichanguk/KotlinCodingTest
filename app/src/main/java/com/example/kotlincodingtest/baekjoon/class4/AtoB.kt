package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())){
    val (A, B) = readLine().split(' ').map { it.toLong() }

    val q = ArrayDeque<Pair<Long, Int>>()
    q.addLast(Pair(A, 1))

    var answer = -1
    while (q.isNotEmpty()) {
        val (n, cnt) = q.removeFirst()

        if (n * 2 == B || n * 10 + 1 == B) {
            answer = cnt + 1
            break
        }

        if (n * 2 < B) {
            q.addLast(Pair(n * 2, cnt + 1))
        }
        if (n * 10 + 1 < B) {
            q.addLast(Pair(n * 10 + 1, cnt + 1))
        }

    }
    println(answer)
}