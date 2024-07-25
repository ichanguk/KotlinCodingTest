package com.example.kotlincodingtest.programmers.Lv3.경주로_건설

import kotlin.math.abs

var answer = Int.MAX_VALUE

class Solution {
    fun solution(board: Array<IntArray>): Int {
        val N = board.size
        val dq = ArrayDeque<List<Int>>()
        val boardList = MutableList(N){MutableList(N){Int.MAX_VALUE}}
        boardList[0][0] = 0
        for (i in 0 until N) {
            for (j in 0 until N) {
                if (board[i][j] == 1) {
                    boardList[i][j] = 1
                }
            }
        }


        dq.addLast(listOf(0, 0, 0, 1))
        bfs(dq, boardList, N)
        dq.addLast(listOf(0, 0, 0, 2))
        bfs(dq, boardList, N)



        return answer
    }
}

val dx = listOf(-1, 0, 1, 0)
val dy = listOf(0, 1, 0, -1)
var nx = 0
var ny = 0

fun bfs(dq:ArrayDeque<List<Int>>, board: MutableList<MutableList<Int>>, N:Int) {
    while (dq.isNotEmpty()) {
        val (curX, curY, cost, dir) = dq.removeFirst()

        if (curX == N - 1 && curY == N - 1) {
            answer = minOf(answer, cost)
            continue
        }

        for (i in 0 until 4) {
            if (abs(i - dir) == 2) {
                continue
            }
            nx = curX + dx[i]
            ny = curY + dy[i]
            if (nx in 0 until N && ny in 0 until N) {
                if (i == dir) {
                    if (cost + 100 <= board[nx][ny]) {
                        board[nx][ny] = cost + 100
                        dq.addLast(listOf(nx, ny, cost + 100, i))
                    }
                } else {
                    if (cost + 600 <= board[nx][ny]) {
                        board[nx][ny] = cost + 600
                        dq.addLast(listOf(nx, ny, cost + 600, i))
                    }
                }
            }
        }
    }
}