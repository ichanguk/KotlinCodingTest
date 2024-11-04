package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.StringTokenizer

private var ans = 0
private var r = 0
private var c = 0
private var k = 0

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    r = st.nextToken().toInt()
    c = st.nextToken().toInt()
    k = st.nextToken().toInt()

    val map = Array(r) { CharArray(c) { '.' } }

    repeat(r) {
        map[it] = readLine().toCharArray()
    }
    map[r - 1][0] = 'T'

    if (map[0][c - 1] == 'T') {
        println(0)
        return@with
    }

    dfs(r - 1, 0, map, 1)
    println(ans)
}

private val dx = listOf(-1, 0, 1, 0)
private val dy = listOf(0, 1, 0, -1)

private fun dfs(
    x: Int,
    y: Int,
    map: Array<CharArray>,
    cnt: Int
) {
    if (cnt == k) {
        if (x == 0 && y == c - 1) {
            ans++
        }
        return
    }


    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx in 0 until r && ny in 0 until c && map[nx][ny] != 'T') {
            map[nx][ny] = 'T'
            dfs(nx, ny, map, cnt + 1)
            map[nx][ny] = '.'
        }
    }
}
