package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (r, c) = readLine().split(' ').map { it.toInt() }

    val scoreMap = mutableMapOf<Int, Int>()

    repeat(r) {
        val input = readLine()
        for (i in 1 until c) {
            if (input[i].isDigit()) {
                scoreMap[input[i] - '0'] = i
                break
            }
        }
    }

    val sortedMap = scoreMap.toList().sortedByDescending { it.second }

    val rankList = IntArray(10) { 0 }

    var curScore = sortedMap[0].second
    var curRank = 1

    sortedMap.forEach {
        if (it.second < curScore) {
            curScore = it.second
            curRank++
        }
        rankList[it.first] = curRank
    }

    for (i in 1..9) {
        println(rankList[i])
    }
}