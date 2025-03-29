package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var n = readLine()

    var cnt = 0
    while (n.length > 1) {
        var nextN = n[0] - '0'

        for (i in 1 until n.length) {
            nextN *= n[i] - '0'
        }

        n = nextN.toString()
        cnt++
    }

    println(cnt)
}