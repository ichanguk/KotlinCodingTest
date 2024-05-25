package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader

private var isVisit = mutableListOf(mutableListOf<Boolean>())
private var N = 0
private var cnt = 0


fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    N = readLine().toInt()
    isVisit = MutableList(N) { MutableList(N) { false } }
    var input: String
    for (i in 0 until N) {
        input = readLine()
        for (j in 0 until N) {
            if (input[j] == '0') {
                isVisit[i][j] = true
            }
        }
    }

    var totalCnt = 0
    var cntList = mutableListOf<Int>()
    for (i in 0 until N) {
        for (j in 0 until N) {
            if (!isVisit[i][j]) {
                cnt = 0
                dfs(i, j)
                totalCnt++
                cntList.add(cnt)
            }
        }
    }

    println(totalCnt)
    cntList.sorted().forEach {
        println(it)
    }

}

private val dx = mutableListOf(-1, 0, 1, 0)
private val dy = mutableListOf(0, 1, 0, -1)

private fun dfs(x:Int, y:Int) {
    cnt++
    isVisit[x][y] = true
    var nx:Int
    var ny:Int
    for (i in 0 until 4) {
        nx = x + dx[i]
        ny = y + dy[i]
        if (nx in 0 until N && ny in 0 until N && !isVisit[nx][ny]) {
            dfs(nx, ny)
        }
    }
}