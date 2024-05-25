package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val isVisit = MutableList(N) { MutableList(M) { false } }

    for (i in 0 until N) {
        readLine().forEachIndexed { index, c ->
            if (c == '0') {
                isVisit[i][index] = true
            }
        }
    }

    val q = ArrayDeque<Triple<Int, Int, Int>>()
    q.addLast(Triple(0, 0, 1))

    val dx = mutableListOf(-1, 0, 1, 0)
    val dy = mutableListOf(0, 1, 0, -1)
    var nx:Int
    var ny:Int

    while (q.isNotEmpty()) {
        val cur = q.removeFirst()
        if (cur.first == N - 1 && cur.second == M - 1) {
            println(cur.third)
            break
        }

        for (i in 0 until 4) {
            nx = cur.first + dx[i]
            ny = cur.second + dy[i]

            if (nx in 0 until N && ny in 0 until M && !isVisit[nx][ny]) {
                isVisit[nx][ny] = true
                q.addLast(Triple(nx, ny, cur.third + 1))
            }
        }
    }
}