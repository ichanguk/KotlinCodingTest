package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val M = readLine().toInt()
    val input = readLine()

    var res = 0
    var cnt = 0
    var flag = false
    var isITurn = false
    for (i in 0 until M) {
        if (!flag && input[i] == 'I') {
            flag = true
            isITurn = true
        }
        if (flag) {
            cnt++
            if (isITurn && input[i] == 'I') {
                isITurn = false
            } else if (!isITurn && input[i] == 'O') {
                isITurn = true
            } else {
                if (input[i] == 'I') {
                    cnt = 1
                } else {
                    cnt = 0
                    flag = false
                }
                continue
            }

            if (cnt == 2 * N + 1) {
                res++
                cnt -= 2
            }
        }
    }
    println(res)
}