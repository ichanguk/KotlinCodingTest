package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader

private var isVisit = mutableListOf(mutableListOf<Boolean>())

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()
    for (i in 1..T) {
        val (M, N, K) = readLine().split(' ').map { it.toInt() }
        isVisit = MutableList(N) { MutableList(M) { true } }
        for (j in 1..K) {
            val (y, x) = readLine().split(' ').map { it.toInt() }
            isVisit[x][y] = false
        }

        var cnt = 0
        for (j in 0 until N) {
            for (k in 0 until M) {
                if (!isVisit[j][k]) {
                    dfs(j, k, N, M)
                    cnt++
                }
            }
        }
        println(cnt)
    }
}

private val dx = mutableListOf(-1, 0, 1, 0)
private val dy = mutableListOf(0, 1, 0, -1)

private fun dfs(x: Int, y: Int, n: Int, m: Int) {
    isVisit[x][y] = true
    var nx: Int
    var ny: Int
    for (i in 0 until 4) {
        nx = x + dx[i]
        ny = y + dy[i]

        if (nx in 0 until n && ny in 0 until m && !isVisit[nx][ny]) {
            dfs(nx, ny, n, m)
        }
    }
}