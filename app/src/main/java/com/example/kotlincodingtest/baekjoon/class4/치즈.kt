package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader
import java.util.StringTokenizer

lateinit var c: Array<IntArray>
var n = 0
var m = 0

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var st = StringTokenizer(readLine())
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()

    c = Array(n) { IntArray(m) { 0 } }

    repeat(n) {
        st = StringTokenizer(readLine())

        for (i in 0 until m) {
            c[it][i] = st.nextToken().toInt()
        }
    }

    bfs(0, 0)

    val meltQ = ArrayDeque<Pair<Int, Int>>()
    var ans = 0

    while (true) {
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (c[i][j] == 1) {
                    var cnt = 0
                    for (k in 0 until 4) {
                        if (c[i + dx[k]][j + dy[k]] == -1) {
                            cnt++
                        }
                    }
                    if (cnt >= 2) {
                        meltQ.addLast(Pair(i, j))
                    }
                }

            }
        }

        if (meltQ.isEmpty()) {
            break
        }
        ans++

        while (meltQ.isNotEmpty()) {
            val (sx, sy) = meltQ.removeFirst()

            c[sx][sy] = -1

            for (i in 0 until 4) {
                val nx = sx + dx[i]
                val ny = sy + dy[i]

                if (c[nx][ny] == 0) {
                    bfs(nx,ny)
                }
            }
        }

    }

    println(ans)

}

private val dx = listOf(-1, 0, 1, 0)
private val dy = listOf(0, 1, 0, -1)

private fun bfs(sx: Int, sy: Int) {
    val q = ArrayDeque<Pair<Int, Int>>()
    q.addLast(Pair(sx, sy))
    c[sx][sy] = -1
    while (q.isNotEmpty()) {
        val (x, y) = q.removeFirst()

        for (i in 0 until 4) {
            val nx = x + dx[i]
            val ny = y + dy[i]

            if (nx in 0 until n && ny in 0 until m && c[nx][ny] == 0) {
                q.addLast(Pair(nx, ny))
                c[nx][ny] = -1
            }
        }
    }
}