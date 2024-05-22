package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val tomatoList = MutableList(M) { MutableList(N) { 0 } }

    val q = ArrayDeque<Triple<Int, Int, Int>>()
    for (i in 0 until M) {
        tomatoList[i] = readLine().split(' ').map { it.toInt() }.toMutableList()
        tomatoList[i].forEachIndexed { index, v ->
            if (v == 1) {
                q.addLast(Triple(i, index, 0))
            }
        }
    }

    val dx = listOf(-1, 0, 1, 0)
    val dy = listOf(0, 1, 0, -1)

    var nx:Int
    var ny:Int

    var days = 0
    while (q.isNotEmpty()) {
        val cur = q.removeFirst()
        if (cur.third > days) {
            days = cur.third
        }

        for (i in 0 until 4) {
            nx = cur.first + dx[i]
            ny = cur.second + dy[i]

            if (nx in 0 until M && ny in 0 until N && tomatoList[nx][ny] == 0) {
                q.addLast(Triple(nx, ny, cur.third + 1))
                tomatoList[nx][ny] = 1
            }
        }
    }

    var flag = true
    tomatoList.forEach {
        it.forEach {
            if (it == 0) {
                flag = false
            }
        }
    }

    if (flag) {
        println(days)
    } else {
        println(-1)
    }

}