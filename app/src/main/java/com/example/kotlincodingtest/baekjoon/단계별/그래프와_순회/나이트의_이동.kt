package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()

    val dx = mutableListOf(-2, -2, -1, -1, 1, 1, 2, 2)
    val dy = mutableListOf(-1, 1, -2, 2, -2, 2, -1, 1)
    repeat(T) {
        val N = readLine().toInt()
        val isVisit = MutableList(N) { MutableList(N) { false } }
        val (sx, sy) = readLine().split(' ').map { it.toInt() }
        val (gx, gy) = readLine().split(' ').map { it.toInt() }

        val q = ArrayDeque<Triple<Int, Int, Int>>()
        q.addLast(Triple(sx, sy, 0))

        while (q.isNotEmpty()) {
            val cur = q.removeFirst()
            if (cur.first == gx && cur.second == gy) {
                println(cur.third)
                break
            }
            var nx:Int
            var ny:Int
            for (i in 0 until 8) {
                nx = cur.first + dx[i]
                ny = cur.second + dy[i]

                if (nx in 0 until N && ny in 0 until N && !isVisit[nx][ny]) {
                    isVisit[nx][ny] = true
                    q.addLast(Triple(nx, ny, cur.third + 1))
                }
            }

        }
    }
}