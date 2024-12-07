package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val board = Array(8){ IntArray(7) { 0 } }

    repeat(8) {
        val input = readLine()

        for (i in 0 until 7) {
            board[it][i] = input[i] - '0'
        }
    }

    println(solve(0, 0, board))

}

private val domino = Array(8){ BooleanArray(7) { false } }
private val isVisit = Array(8){ BooleanArray(7) { false } }

private val dx = intArrayOf(0, 1)
private val dy = intArrayOf(1, 0)

private fun solve(x: Int, y: Int, board: Array<IntArray>): Int {
    if (x == 8) {
        return 1
    }
    val nny = if (y == 6) 0 else y + 1
    val nnx = if (nny == 0) x + 1 else x
    var cnt = 0

    if (isVisit[x][y]) {
        return solve(nnx, nny, board)
    } else {
        val num1 = board[x][y]
        isVisit[x][y] = true

        for (i in 0 until 2) {
            val nx = x + dx[i]
            val ny = y + dy[i]

            if (nx in 0 until 8 && ny in 0 until 7) {
                val num2 = board[nx][ny]

                if (!domino[num1][num2] && !isVisit[nx][ny]) {
                    domino[num1][num2] = true
                    domino[num2][num1] = true
                    isVisit[nx][ny] = true
                    cnt += solve(nnx, nny, board)
                    isVisit[nx][ny] = false
                    domino[num1][num2] = false
                    domino[num2][num1] = false

                }
            }
        }
        isVisit[x][y] = false
        return cnt
    }
}
