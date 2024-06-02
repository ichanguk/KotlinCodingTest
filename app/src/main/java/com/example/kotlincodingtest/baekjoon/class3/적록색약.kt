package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader

private var N = 0
private var picture = mutableListOf(charArrayOf('a'))
private var isVisit = mutableListOf(mutableListOf(false))

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    N = readLine().toInt()
    picture = MutableList(N) { CharArray(N) }
    repeat(N) { i ->
        picture[i] = readLine().toCharArray()
    }
    isVisit = MutableList(N) { MutableList(N) { false } }

    var sx = 0
    var sy = 0
    var cnt1 = 0
    var cnt2 = 0
    var flag:Boolean
    while (true) {
        flag = true
        loop@for (i in 0 until N) {
            for (j in 0 until N) {
                if (!isVisit[i][j]) {
                    flag = false
                    sx = i
                    sy = j
                    break@loop
                }
            }
        }
        if (flag) {
            break
        }
        bfs(sx, sy)
        cnt1++
    }

    isVisit = MutableList(N) { MutableList(N) { false } }
    for (i in 0 until N) {
        for (j in 0 until N) {
            if (picture[i][j] == 'G') {
                picture[i][j] = 'R'
            }
        }
    }


    while (true) {
        flag = true
        loop@for (i in 0 until N) {
            for (j in 0 until N) {
                if (!isVisit[i][j]) {
                    flag = false
                    sx = i
                    sy = j
                    break@loop
                }
            }
        }
        if (flag) {
            break
        }
        bfs(sx, sy)
        cnt2++
    }
    println("$cnt1 $cnt2")
}

private val dx = mutableListOf(-1, 0, 1, 0)
private val dy = mutableListOf(0, 1, 0, -1)
private var nx = 0
private var ny = 0

private fun bfs(sx: Int, sy: Int) {
    val q = ArrayDeque<Pair<Int, Int>>()
    q.addLast(Pair(sx, sy))
    isVisit[sx][sy] = true
    val sColor = picture[sx][sy]

    while (q.isNotEmpty()) {
        val cur = q.removeFirst()
        for (i in 0 until 4) {
            nx = cur.first + dx[i]
            ny = cur.second + dy[i]

            if (nx in 0 until N && ny in 0 until N && !isVisit[nx][ny]) {
                if (picture[nx][ny] == sColor) {
                    isVisit[nx][ny] = true
                    q.addLast(Pair(nx, ny))
                }
            }
        }
    }
}

