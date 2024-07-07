package com.example.kotlincodingtest.programmers.Lv2.N_Queen

import kotlin.math.abs
var answer = 0
var N = 0
lateinit var board:MutableList<Int>
class Solution {
    fun solution(n: Int): Int {
        N = n
        board = MutableList(N){ 0 }

        nQueen(0)

        return answer
    }
}

fun nQueen(depth:Int) {
    if (depth == N) {
        answer++
        return
    }

    for (i in 0 until N) {
        board[depth] = i
        if (canPlace(depth)) {
            nQueen(depth + 1)
        }
    }
}

fun canPlace(depth:Int):Boolean {
    for (i in 0 until depth) {
        if (board[depth] == board[i] ||
            depth - i == abs(board[depth] - board[i])) {
            return false
        }
    }
    return true
}