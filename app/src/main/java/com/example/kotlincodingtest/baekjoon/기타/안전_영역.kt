package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.StringTokenizer

private var n = 0

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    n = readLine().toInt()
    val g = Array(n) { IntArray(n) { 0 } }

    var st:StringTokenizer
    val heights = mutableSetOf<Int>()
    repeat(n) {
        st = StringTokenizer(readLine())

        for (i in 0 until n) {
            g[it][i] = st.nextToken().toInt()
            heights.add(g[it][i])
        }
    }

    var ans = 0
    var tmp: Array<BooleanArray>
    var cnt: Int
    var isVisit: Array<BooleanArray>

    heights.forEach {
        tmp = Array(n) { BooleanArray(n) { true } }
        isVisit = Array(n) { BooleanArray(n) { false } }
        cnt = 0

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (g[i][j] <= it) {
                    tmp[i][j] = false
                }
            }
        }

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (tmp[i][j] && !isVisit[i][j]) {
                    cnt++
                    bfs(tmp, isVisit, i, j)
                }
            }
        }

        ans = maxOf(ans, cnt)
    }

    println(maxOf(ans, 1))
}

private val dx = intArrayOf(-1, 0, 1, 0)
private val dy = intArrayOf(0, 1, 0, -1)

private fun bfs(tmp: Array<BooleanArray>, visit: Array<BooleanArray>, x: Int, y: Int) {
    visit[x][y] = true
    val q = ArrayDeque<Pair<Int, Int>>()
    q.addLast(Pair(x, y))

    while (q.isNotEmpty()) {
        val (curX, curY) = q.removeFirst()

        for (i in 0 until 4) {
            val nx = curX + dx[i]
            val ny = curY + dy[i]

            if (nx in 0 until n && ny in 0 until n && tmp[nx][ny] && !visit[nx][ny]) {
                visit[nx][ny] = true
                q.addLast(Pair(nx, ny))
            }
        }
    }
}