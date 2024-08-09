package com.example.kotlincodingtest.programmers.Lv3.파괴되지_않은_건물

class Solution {
    fun solution(board: Array<IntArray>, skill: Array<IntArray>): Int {
        var answer: Int = 0
        val N = board.size
        val M = board[0].size
        val sumList = Array(N + 1) { IntArray(M + 1) { 0 } }

        skill.forEach{
            if (it[0] == 1) {
                sumList[it[1]][it[2]] -= it[5]
                sumList[it[1]][it[4] + 1] += it[5]
                sumList[it[3] + 1][it[2]] += it[5]
                sumList[it[3] + 1][it[4] + 1] -= it[5]
            } else {
                sumList[it[1]][it[2]] += it[5]
                sumList[it[1]][it[4] + 1] -= it[5]
                sumList[it[3] + 1][it[2]] -= it[5]
                sumList[it[3] + 1][it[4] + 1] += it[5]
            }
        }

        for (i in 0 until N) {
            for (j in 1 until M) {
                sumList[i][j] += sumList[i][j - 1]
            }
        }

        for (i in 1 until N) {
            for (j in 0 until M) {
                sumList[i][j] += sumList[i - 1][j]
            }
        }

        for (i in 0 until N) {
            for (j in 0 until M) {
                if (board[i][j] + sumList[i][j] > 0) {
                    answer++
                }
            }
        }


        return answer
    }
}