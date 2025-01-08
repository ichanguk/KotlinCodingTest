package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val students = MutableList(n) { List(5) { 0 } }

    repeat(n) {
        students[it] = readLine().split(' ').map { it.toInt() }
    }

    val isFriend = Array(n) { Array(n) { false } }

    for (i in 0 until n) {
        for (j in (i + 1) until n) {
            for (k in 0 until 5) {
                if (students[i][k] == students[j][k]) {
                    isFriend[i][j] = true
                    isFriend[j][i] = true
                    break
                }
            }
        }
    }

    var maxCount = 0
    var ans = 1

    for (i in 0 until n) {
        if (isFriend[i].count { it } > maxCount) {
            maxCount = isFriend[i].count { it }
            ans = i + 1
        }
    }

    println(ans)
}