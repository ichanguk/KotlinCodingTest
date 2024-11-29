package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m) = readLine().split(' ').map { it.toInt() }

    val picture = Array(101) { IntArray(101) { 0 } }

    repeat(n) {
        val (lbx, lby, rtx, rty) = readLine().split(' ').map { it.toInt() }

        for (i in lbx..rtx) {
            for (j in lby..rty) {
                picture[i][j]++
            }
        }
    }

    var ans = 0

    for (i in 1..100) {
        for (j in 1..100) {
            if (picture[i][j] > m) {
                ans++
            }
        }
    }

    println(ans)
}