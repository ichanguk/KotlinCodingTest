package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()

    repeat(T) {
        readLine()
        val (n, m) = readLine().split(' ').map { it.toInt() }
        val teamS = readLine().split(' ').map { it.toInt() }
        val teamB = readLine().split(' ').map { it.toInt() }

        if (teamS.max() >= teamB.max()) {
            println("S")
        } else {
            println("B")
        }

    }
}