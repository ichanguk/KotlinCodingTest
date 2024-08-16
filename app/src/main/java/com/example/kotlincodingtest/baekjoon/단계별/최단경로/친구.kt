package com.example.kotlincodingtest.baekjoon.단계별.최단경로

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val friends = Array(N) { "" }
    val twoFriends = Array(N) { BooleanArray(N) { false } }

    repeat(N) {
        friends[it] = readLine()
        for (i in 0 until N) {
            if (friends[it][i] == 'Y') {
                twoFriends[it][i] = true
            }
        }
    }

    for (k in 0 until N) {
        for (i in 0 until N) {
            for (j in 0 until N) {
                if (friends[i][k] == 'Y' && friends[k][j] == 'Y') {
                    twoFriends[i][j] = true
                }
            }
        }
    }

    var answer = 0
    twoFriends.forEach {
        answer = maxOf(answer, it.count { it })
    }

    println(answer)
}