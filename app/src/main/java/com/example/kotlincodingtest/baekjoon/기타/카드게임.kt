package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val aScore = readLine().split(' ').map { it.toInt() }
    val bScore = readLine().split(' ').map { it.toInt() }

    var aWin = 0
    var bWin = 0

    for (i in 0 until 10) {
        if (aScore[i] > bScore[i]) {
            aWin++
        } else if (aScore[i] < bScore[i]) {
            bWin++
        }
    }

    if (aWin > bWin) {
        println("A")
    } else if (bWin > aWin) {
        println("B")
    } else {
        println("D")
    }

}