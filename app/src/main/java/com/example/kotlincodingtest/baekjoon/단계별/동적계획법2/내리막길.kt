package com.example.kotlincodingtest.baekjoon.단계별.동적계획법2

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

private lateinit var map: Array<IntArray>
private lateinit var dp: Array<IntArray>

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    var st: StringTokenizer

    map = Array(N) { IntArray(M) { 0 } }

    for (i in 0 until N) {
        st = StringTokenizer(readLine())
        for (j in 0 until M) {
            map[i][j] = st.nextToken().toInt()
        }
    }

    dp = Array(N) { IntArray(M) { -1 } }

    val bw = BufferedWriter(System.out.bufferedWriter())
    bw.write("${dfs(0, 0, N, M)}\n")
    bw.flush()
    bw.close()
}

private val dx = intArrayOf(-1, 0, 1, 0)
private val dy = intArrayOf(0, 1, 0, -1)
private fun dfs(x: Int, y: Int, N:Int, M: Int): Int {
    if (x == (N - 1) && y == (M - 1)) {
        return 1
    }

    if (dp[x][y] != -1) {
        return dp[x][y]
    }

    dp[x][y] = 0

    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx in 0 until N && ny in 0 until M && map[nx][ny] < map[x][y]) {
            dp[x][y] += dfs(nx,ny, N, M)
        }
    }

    return dp[x][y]
}