package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.ArrayDeque
import java.util.StringTokenizer

var m = mutableListOf<MutableList<Int>>()
var N = 0
var M = 0
var virusTime = 0
var lateTime = 0
private val bw = BufferedWriter(System.out.bufferedWriter())
private var isVisit = mutableListOf<MutableList<Boolean>>()

private val dx = mutableListOf(-1, 0, 1, 0)
private val dy = mutableListOf(0, 1, 0, -1)

private var nx = 0
private var ny = 0
val q = ArrayDeque<Triple<Int, Int, Int>>()

val q2 = ArrayDeque<Triple<Int, Int, Int>>()

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var st = StringTokenizer(readLine())
    N = st.nextToken().toInt()
    M = st.nextToken().toInt()
    st = StringTokenizer(readLine())
    virusTime = st.nextToken().toInt()
    lateTime = st.nextToken().toInt()
    st.nextToken()
    st.nextToken()
    m = MutableList(N) { MutableList<Int>(M) { 0 } }
    isVisit = MutableList(N) { MutableList<Boolean>(M) { false } }
    for (i in 0 until N) {
        val input = readLine().toCharArray()
        for (j in 0 until M) {
            if (input[j] == '*') {
                m[i][j] = 1
                q.push(Triple(i, j, 0))
                isVisit[i][j] = true
            } else if (input[j] == '#') {
                m[i][j] = 2
            }
        }
    }
    bfs()
    var flag = false
    for (i in 0 until N) {
        for (j in 0 until M) {
            if (m[i][j] != 1) {
                flag = true
                bw.write("${i + 1} ${j + 1}\n")
            }
        }
    }
    if (!flag) {
        bw.write("-1\n")
    }
    bw.flush()
    bw.close()
}

private var x = 0
private var y = 0
private var z = 0

private fun bfs() {
    while (!q.isEmpty() || !q2.isEmpty()) {
        if (!q.isEmpty() && !q2.isEmpty()) {
            if (q.first.third <= q2.first.third) {
                x = q.first.first
                y = q.first.second
                z = q.first.third
                q.removeFirst()
            } else {
                x = q2.first.first
                y = q2.first.second
                z = q2.first.third
                q2.removeFirst()
            }
        } else if (!q.isEmpty()) {
            x = q.first.first
            y = q.first.second
            z = q.first.third
            q.removeFirst()
        } else {
            x = q2.first.first
            y = q2.first.second
            z = q2.first.third
            q2.removeFirst()
        }

        if (z >= virusTime) {
            continue
        }
        for (i in 0..3) {
            nx = x + dx[i]
            ny = y + dy[i]
            if (nx in 0 until N && ny in 0 until M && !isVisit[nx][ny]) {
                isVisit[nx][ny] = true
                if (m[nx][ny] == 0) {
                    q.addLast(Triple(nx, ny, z + 1))
                    m[nx][ny] = 1
                } else if (m[nx][ny] == 2) {
                    q2.addLast(Triple(nx, ny, z + 1 + lateTime))
                    if (z + lateTime < virusTime) {
                        m[nx][ny] = 1
                    }
                }
            }
        }
    }
}