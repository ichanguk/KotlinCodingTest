package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val room = Array(N) { CharArray(N) {' '} }

    repeat(N) {
        room[it] = readLine().toCharArray()
    }

    var j = 0
    var cnt1 = 0
    var cnt2 = 0
    var ans1 = 0
    var ans2 = 0

    for (i in 0 until N) {
        j = 0
        cnt1 = 0
        cnt2 = 0

        while (j < N) {
            if (room[i][j] == 'X') {
                if (cnt1 >= 2) {
                    ans1++
                }
                cnt1 = 0
            } else {
                cnt1++
            }

            if (room[j][i] == 'X') {
                if (cnt2 >= 2) {
                    ans2++
                }
                cnt2 = 0
            } else {
                cnt2++
            }
            j++
        }

        if (cnt1 >= 2) {
            ans1++
        }
        if (cnt2 >= 2) {
            ans2++
        }
    }

    println("$ans1 $ans2")
}
