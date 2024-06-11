package com.example.kotlincodingtest.programmers.Lv1.크레인_인형뽑기_게임


class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val N = board.size
        var boardMap = MutableList(N) { ArrayDeque<Int>() }

        for (i in 0 until N) {
            for (j in 0 until N) {
                if (board[i][j] != 0) {
                    boardMap[j].addFirst(board[i][j])
                }
            }
        }

        val basket = ArrayDeque<Int>()
        for (m in moves) {
            if (boardMap[m - 1].isNotEmpty()) {
                if (basket.isNotEmpty() &&
                    basket.last() == boardMap[m - 1].last()
                ) {
                    answer += 2
                    basket.removeLast()
                } else {
                    basket.addLast(boardMap[m - 1].last())
                }
                boardMap[m - 1].removeLast()
            }
        }
        return answer
    }
}