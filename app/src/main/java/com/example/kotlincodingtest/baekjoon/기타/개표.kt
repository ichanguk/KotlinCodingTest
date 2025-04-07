package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val votes = readLine()

    var aCnt = 0
    var bCnt = 0
    for (v in votes) {
        if (v == 'A') {
            aCnt++
        } else {
            bCnt++
        }
    }

    if (aCnt > bCnt) {
        println("A")
    } else if (aCnt == bCnt) {
        println("Tie")
    } else {
        println("B")
    }
}