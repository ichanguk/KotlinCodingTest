package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader
import java.util.StringTokenizer

private var isVisit = mutableListOf(mutableListOf<Boolean>())
private var paper = mutableListOf(listOf<Int>())
private var res = 0
private var N = 0
private var M = 0

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    N = st.nextToken().toInt()
    M = st.nextToken().toInt()

    paper = MutableList(N) { listOf() }
    for (i in 0 until N) {
        paper[i] = readLine().split(' ').map { it.toInt() }
    }
    isVisit = MutableList(N) { MutableList(M) { false } }

    for (i in 0 until N) {
        for (j in 0 until M) {
            isVisit[i][j] = true
            dfs(i, j, paper[i][j], 1)
            isVisit[i][j] = false
        }
    }
    println(res)
}

private val dx = mutableListOf(-1, 0, 1, 0)
private val dy = mutableListOf(0, 1, 0, -1)

private fun dfs(x: Int, y: Int, sum:Int, cnt:Int) {
    if (cnt == 4) {
        res = maxOf(res, sum)
        return
    }
    var nx:Int
    var ny:Int
    for (i in 0 until 4) {
        nx = x + dx[i]
        ny = y + dy[i]

        if (nx in 0 until N && ny in 0 until M && !isVisit[nx][ny]) {
            if (cnt == 2) {
                isVisit[nx][ny] = true
                dfs(x, y, sum + paper[nx][ny], cnt + 1)
                isVisit[nx][ny] = false
            }
            isVisit[nx][ny] = true
            dfs(nx, ny, sum + paper[nx][ny], cnt + 1)
            isVisit[nx][ny] = false

        }
    }
}