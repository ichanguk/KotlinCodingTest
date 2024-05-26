package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (M, N, H) = readLine().split(' ').map { it.toInt() }
    val isVisit = MutableList(H) { MutableList(N) { MutableList(M) { false } } }
    val q = ArrayDeque<Pair<Triple<Int, Int, Int>, Int>>()

    for (i in 0 until H) {
        for (j in 0 until N) {
            readLine().split(' ').forEachIndexed { index, c ->
                if (c == "-1") {
                    isVisit[i][j][index] = true
                } else if (c == "1") {
                    q.addLast(Pair(Triple(i, j, index), 0))
                    isVisit[i][j][index] = true
                }
            }
        }
    }


    val dx = mutableListOf(0, 0, -1, 0, 1, 0)
    val dy = mutableListOf(0, 0, 0, 1, 0, -1)
    val dz = mutableListOf(1, -1, 0, 0, 0, 0)
    var nx: Int
    var ny: Int
    var nz: Int

    var res = 0
    while (q.isNotEmpty()) {
        val cur = q.removeFirst()
        if (cur.second > res) {
            res = cur.second
        }
        for (i in 0 until 6) {
            nz = cur.first.first + dz[i]
            nx = cur.first.second + dx[i]
            ny = cur.first.third + dy[i]

            if (nx in 0 until N && ny in 0 until M && nz in 0 until H && !isVisit[nz][nx][ny]) {
                isVisit[nz][nx][ny] = true
                q.addLast(Pair(Triple(nz, nx, ny), cur.second + 1))
            }
        }
    }

    isVisit.forEach {
        it.forEach {
            it.forEach {
                if (!it) {
                    println(-1)
                    return@with
                }
            }
        }
    }
    println(res)
}