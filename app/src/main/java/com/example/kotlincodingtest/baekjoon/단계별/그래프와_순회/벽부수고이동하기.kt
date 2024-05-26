package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val isVisit = MutableList(N) { MutableList(M) { false } }
    val isVisit2 = MutableList(N) { MutableList(M) { false } }

    val m = MutableList(N) { "" }

    for (i in 0 until N) {
        m[i] = readLine()
    }
    val q = ArrayDeque<Pair<Triple<Int, Int, Int>, Boolean>>()
    q.addLast(Pair(Triple(0, 0, 1), false))

    val dx = mutableListOf(-1, 0, 1, 0)
    val dy = mutableListOf(0, 1, 0, -1)
    var nx: Int
    var ny: Int

    while (q.isNotEmpty()) {
        val cur = q.removeFirst()
        if (cur.first.first == N - 1 && cur.first.second == M - 1) {
            println(cur.first.third)
            return@with
        }

        for (i in 0 until 4) {
            nx = cur.first.first + dx[i]
            ny = cur.first.second + dy[i]

            if (nx in 0 until N && ny in 0 until M) {
                if (cur.second) {
                    if (!isVisit2[nx][ny] && m[nx][ny] == '0') {
                        isVisit2[nx][ny] = true
                        q.addLast(Pair(Triple(nx, ny, cur.first.third + 1), true))
                    }
                } else {
                    if (!isVisit[nx][ny]) {
                        if (m[nx][ny] == '1') {
                            isVisit2[nx][ny] = true
                            q.addLast(Pair(Triple(nx, ny, cur.first.third + 1), true))
                        } else {
                            isVisit[nx][ny] = true
                            q.addLast(Pair(Triple(nx, ny, cur.first.third + 1), false))
                        }
                    }
                }
            }
        }
    }

    println(-1)
}