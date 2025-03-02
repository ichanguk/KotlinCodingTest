package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (k, l, n) = readLine().split(' ').map { it.toInt() }

    val cmd = readLine()

    var using = false
    var firstFlush = false
    var usingCnt = 0
    var notUsingCnt = 0
    var t = 1

    for (c in cmd) {
        if (c == '1') {
            usingCnt++
            notUsingCnt = 0
            if (usingCnt >= k) {
                using = true
                firstFlush = true
            }
        } else {
            notUsingCnt++
            usingCnt = 0
            if (using && notUsingCnt >= l) {
                println(t)
                using = false
            }
        }
        t++
    }

    if (using) {
        println(t + l - notUsingCnt - 1)
    }

    if (!firstFlush) {
        println("NIKAD")
    }
}