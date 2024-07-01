package com.example.kotlincodingtest.programmers.Lv2.리코쳇_로봇

class Solution {
    fun solution(board: Array<String>): Int {
        val N = board.size
        val M = board[0].length
        var (sx, sy) = intArrayOf(0, 0)
        loop@ for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] == 'R') {
                    sx = i
                    sy = j
                    break@loop
                }
            }
        }
        val q = ArrayDeque<Triple<Int, Int, Int>>()
        val isVisit = MutableList(N) { MutableList(M) { false } }
        q.addLast(Triple(sx, sy, 0))
        isVisit[sx][sy] = true

        var nx: Int
        var ny: Int
        val dx = intArrayOf(-1, 0, 1, 0)
        val dy = intArrayOf(0, 1, 0, -1)
        var flag: Boolean
        while (q.isNotEmpty()) {
            val (curX, curY, cnt) = q.removeFirst()
            if (board[curX][curY] == 'G') {
                return cnt
            }

            for (i in 0 until 4) {
                flag = false
                nx = curX + dx[i]
                ny = curY + dy[i]
                while (nx in 0 until N && ny in 0 until M
                    && board[nx][ny] != 'D'
                ) {
                    flag = true
                    nx += dx[i]
                    ny += dy[i]
                }
                nx -= dx[i]
                ny -= dy[i]
                if (flag && !isVisit[nx][ny]) {
                    q.addLast(Triple(nx, ny, cnt + 1))
                    isVisit[nx][ny] = true
                }
            }

        }

        return -1
    }
}