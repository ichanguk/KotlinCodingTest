package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, K) = readLine().split(' ').map { it.toInt() }
    val isVisit = MutableList(100001) { false }
    val q = ArrayDeque<Pair<Int, Int>>()
    q.addLast(Pair(N, 0))

    isVisit[N] = true
    while (q.isNotEmpty()) {
        val cur = q.removeFirst()
        if (cur.first == K) {
            println(cur.second)
            break
        }

        val nc = mutableListOf(cur.first - 1, cur.first + 1, cur.first * 2)
        nc.forEach {
            if (it in 0..100000 && !isVisit[it]) {
                isVisit[it] = true
                q.addLast(Pair(it, cur.second + 1))
            }
        }
    }
}