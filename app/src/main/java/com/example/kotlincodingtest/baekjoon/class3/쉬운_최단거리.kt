package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val m = MutableList(N) { MutableList(M) { 0 } }

    var st: StringTokenizer
    val q = ArrayDeque<Triple<Int, Int, Int>>()
    val isVisit = MutableList(N) { MutableList(M) { false } }
    for (i in 0 until N) {
        st = StringTokenizer(readLine())
        for (j in 0 until M) {
            m[i][j] = st.nextToken().toInt()
            if (m[i][j] == 2) {
                m[i][j] = 0
                q.addFirst(Triple(i, j, 0))
            }
            if (m[i][j] == 0) {
                isVisit[i][j] = true
            }

        }
    }

    val dx = listOf(-1, 0, 1, 0)
    val dy = listOf(0, 1, 0, -1)
    var nx: Int
    var ny: Int
    while (q.isNotEmpty()) {
        val cur = q.removeFirst()

        for (i in 0 until 4) {
            nx = cur.first + dx[i]
            ny = cur.second + dy[i]

            if (nx in 0 until N && ny in 0 until M && !isVisit[nx][ny]) {
                isVisit[nx][ny] = true
                q.addLast(Triple(nx, ny, cur.third + 1))
                m[nx][ny] = cur.third + 1
            }
        }
    }

    val bw = BufferedWriter(System.out.bufferedWriter())

    for (i in 0 until N) {
        for (j in 0 until M) {
            if(!isVisit[i][j]) {
                m[i][j] = -1
            }
        }
    }
    m.forEach {
        it.forEach {
            bw.write("$it ")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}