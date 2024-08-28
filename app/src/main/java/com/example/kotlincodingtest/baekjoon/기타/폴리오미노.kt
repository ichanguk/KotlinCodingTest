package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val board = readLine()

    var i = 0
    var cnt = 0
    val mino = arrayOf("AAAA", "BB")
    val answer = StringBuilder()
    while (i < board.length) {
        if (board[i] == '.' || i == board.length - 1) {
            if (i == board.length - 1 && board[i] == 'X') {
                cnt++
            }
           if (cnt % 4 == 0) {
               repeat(cnt / 4) {
                   answer.append(mino[0])
               }
           } else if (cnt % 2 == 0) {
               repeat(cnt / 4) {
                   answer.append(mino[0])
               }
               answer.append(mino[1])
           } else {
               println("-1")
               return@with
           }
            if (board[i] == '.') {
                answer.append('.')
            }
            cnt = 0
        } else {
            cnt++
        }
        i++
    }

    println(answer.toString())

}