package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val campus = MutableList(N) { "" }
    val isVisit = MutableList(N) { MutableList(M) { false } }
    var start = Pair(0, 0)

    for (i in 0 until N) {
        campus[i] = readLine()
        campus[i].forEachIndexed { j, c ->
            if (c == 'X') {
                isVisit[i][j] = true
            } else if (c == 'I') {
                start = Pair(i, j)
                isVisit[i][j] = true
            }
        }
    }
    val q = ArrayDeque<Pair<Int, Int>>()
    q.addLast(start)

    val dx = mutableListOf(-1, 0, 1, 0)
    val dy = mutableListOf(0, 1, 0, -1)
    var nextCur:Pair<Int, Int>
    var cnt = 0
    while (q.isNotEmpty()) {
        val cur = q.removeFirst()

        for (i in 0 until 4) {
            nextCur = Pair(cur.first + dx[i], cur.second + dy[i])
            if (nextCur.first in 0 until N && nextCur.second in 0 until M && !isVisit[nextCur.first][nextCur.second]) {
                q.addLast(nextCur)
                isVisit[nextCur.first][nextCur.second] = true
                if (campus[nextCur.first][nextCur.second] == 'P') {
                    cnt++
                }
            }
        }
    }
    if (cnt > 0) {
        println(cnt)
    } else {
        println("TT")
    }
}