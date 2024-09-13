package com.example.kotlincodingtest.programmers.Lv2.혼자서_하는_틱택토

class Solution {
    fun solution(board: Array<String>): Int {
        var firstMark = 0
        var secondMark = 0
        for (marks in board) {
            firstMark += marks.count{ it == 'O' }
            secondMark += marks.count{ it == 'X' }
        }
        if (secondMark > firstMark) {
            return 0
        }
        if (firstMark > secondMark + 1) {
            return 0
        }

        for (marks in board) {
            if (!isCorrect(marks.count{ it == 'O'}, marks.count{ it == 'X' },
                    firstMark, secondMark)) {
                return 0
            }
        }

        var firstMarkCol: Int
        var secondMarkCol: Int
        for (j in 0 until 3) {
            firstMarkCol = 0
            secondMarkCol = 0
            for (i in 0 until 3) {
                if (board[i][j] == 'O') {
                    firstMarkCol++
                } else if (board[i][j] == 'X') {
                    secondMarkCol++
                }
            }
            if (!isCorrect(firstMarkCol, secondMarkCol,
                    firstMark, secondMark)) {
                return 0
            }
        }

        var firstMarkCross = 0
        var secondMarkCross = 0

        for (i in 0 until 3) {
            if (board[i][i] == 'O') {
                firstMarkCross++
            } else if (board[i][i] == 'X') {
                secondMarkCross++
            }
        }

        if (!isCorrect(firstMarkCross, secondMarkCross,
                firstMark, secondMark)) {
            return 0
        }


        firstMarkCross = 0
        secondMarkCross = 0

        for (i in 0 until 3) {
            if (board[i][2 - i] == 'O') {
                firstMarkCross++
            } else if (board[i][2 - i] == 'X') {
                secondMarkCross++
            }
        }

        if (!isCorrect(firstMarkCross, secondMarkCross,
                firstMark, secondMark)) {
            return 0
        }


        return 1
    }

    fun isCorrect(first: Int, second: Int, firstMark: Int, secondMark: Int)
            : Boolean {
        if (first == 3 && firstMark == secondMark) {
            return false
        } else if (second == 3 && firstMark > secondMark) {
            return false
        }
        return true
    }
}