package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

private val sum = intArrayOf(0, 0)

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (m, n) = readLine().split(' ').map { it.toInt() }
    val g = Array(n) { CharArray(m) { ' ' } }

    repeat(n) {
        g[it] = readLine().toCharArray()
    }

    val isVisit = Array(n) { BooleanArray(m) { false } }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (!isVisit[i][j]) {
                bfs(g, i, j ,isVisit, n, m)
            }
        }
    }

    println("${sum[0]} ${sum[1]}")
}

private val dx = intArrayOf(-1, 0, 1, 0)
private val dy = intArrayOf(0, 1, 0, -1)

private fun bfs(g: Array<CharArray>, sx: Int, sy: Int, isVisit: Array<BooleanArray>, n:Int, m: Int) {
    val sc = g[sx][sy]
    var cnt = 0

    val q = ArrayDeque<Pair<Int, Int>>()
    q.addLast(Pair(sx, sy))
    isVisit[sx][sy] = true

    while (q.isNotEmpty()) {
        val (curX, curY) = q.removeFirst()
        cnt++

        repeat(4) {
            val nx = curX + dx[it]
            val ny = curY + dy[it]

            if (nx in 0 until n && ny in 0 until m && !isVisit[nx][ny]) {
                if (g[nx][ny] == sc) {
                    isVisit[nx][ny] = true
                    q.addLast(Pair(nx, ny))
                }
            }
        }
    }

    if (sc == 'W') {
        sum[0] += cnt * cnt
    } else {
        sum[1] += cnt * cnt
    }
}
