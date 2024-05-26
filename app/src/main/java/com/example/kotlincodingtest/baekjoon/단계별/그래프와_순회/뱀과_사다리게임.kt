package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val board = MutableList(101) { 0 }
    val isVisit = MutableList(101) { false }

    repeat(N) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        board[a] = b
    }
    repeat(M) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        board[a] = b
    }

    isVisit[1] = true
    val q = ArrayDeque<Pair<Int, Int>>()
    q.addLast(Pair(1, 0))
    var nc:Int
    while (q.isNotEmpty()) {
        val cur = q.removeFirst()
        if (cur.first == 100) {
            println(cur.second)
            break
        }

        for (i in 1..6) {
            nc = cur.first + i
            if (nc <= 100 && !isVisit[nc]) {
                isVisit[nc] = true
                if (board[nc] != 0) {
                    isVisit[board[nc]] = true
                    q.addLast(Pair(board[nc], cur.second + 1))
                } else {
                    q.addLast(Pair(nc, cur.second + 1))
                }
            }
        }
    }

}