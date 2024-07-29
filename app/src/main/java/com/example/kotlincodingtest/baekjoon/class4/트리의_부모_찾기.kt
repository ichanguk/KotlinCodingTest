package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val tree = List(N + 1) {mutableListOf<Int>()}
    repeat(N - 1) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        tree[a].add(b)
        tree[b].add(a)
    }

    val isVisit = MutableList(N + 1) { false }
    val parents = MutableList(N + 1) { 0 }

    val dq = ArrayDeque<Int>()
    dq.addLast(1)
    isVisit[1] = true

    while (dq.isNotEmpty()) {
        val cur = dq.removeFirst()

        for (n in tree[cur]) {
            if (!isVisit[n]) {
                parents[n] = cur
                dq.addLast(n)
                isVisit[n] = true
            }
        }
    }

    for (i in 2..N) {
        println(parents[i])
    }
}