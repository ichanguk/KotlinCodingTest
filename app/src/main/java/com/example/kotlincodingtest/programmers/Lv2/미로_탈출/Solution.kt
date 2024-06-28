package com.example.kotlincodingtest.programmers.Lv2.미로_탈출

var sx = 0
var sy = 0
var N = 0
var M = 0
var answer: Int = 0

class Solution {
    fun solution(maps: Array<String>): Int {
        N = maps.size
        M = maps[0].length

        loop@ for (i in 0 until N) {
            for (j in 0 until M) {
                if (maps[i][j] == 'S') {
                    sx = i
                    sy = j
                    break@loop
                }
            }
        }
        if ((bfs(sx, sy, 'L', maps) && (bfs(sx, sy, 'E', maps)))) {
            return answer
        } else {
            return -1
        }
    }
}

val dx = mutableListOf(-1, 0, 1, 0)
val dy = mutableListOf(0, 1, 0, -1)
var curX = 0
var curY = 0
var cnt = 0
var nx = 0
var ny = 0

fun bfs(x: Int, y: Int, dest: Char, maps: Array<String>): Boolean {
    val q = ArrayDeque<Triple<Int, Int, Int>>()
    var isVisit = MutableList(N) { MutableList(M) { false } }
    q.addLast(Triple(x, y, 0))
    isVisit[x][y] = true

    while (q.isNotEmpty()) {
        curX = q.first().first
        curY = q.first().second
        cnt = q.removeFirst().third

        if (maps[curX][curY] == dest) {
            sx = curX
            sy = curY
            answer += cnt
            return true
        }

        for (i in 0 until 4) {
            nx = curX + dx[i]
            ny = curY + dy[i]
            if (nx in 0 until N && ny in 0 until M && !isVisit[nx][ny]) {
                isVisit[nx][ny] = true
                if (maps[nx][ny] != 'X') {
                    q.addLast(Triple(nx, ny, cnt + 1))
                }
            }
        }
    }
    return false
}