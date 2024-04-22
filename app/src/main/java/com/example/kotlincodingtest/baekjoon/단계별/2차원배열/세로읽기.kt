package com.example.kotlincodingtest.baekjoon.단계별.`2차원배열`

import java.io.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val board = MutableList<String>(5) {""}
    var inputString: String? = null

    for (i in 0 until 5) {
        board[i] = readLine()
    }

    for (i in 0 until 15) {
        for (j in 0 until 5) {
            if (i >= board[j].length) {
                continue
            }
            print(board[j][i])
        }
    }

}