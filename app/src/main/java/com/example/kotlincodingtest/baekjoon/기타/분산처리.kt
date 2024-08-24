package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()

    for (i in 0 until T) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        if (a % 10 == 0) {
            println(10)
            continue
        }
        val lastNumList = mutableListOf(a % 10)

        var cur = a % 10
        while (true) {
            cur = cur * a % 10
            if (cur == a % 10) {
                break
            }
            lastNumList.add(cur)
        }

        val idx = b % lastNumList.size - 1
        if (idx < 0) {
            println(lastNumList[lastNumList.size - 1])
        } else {
            println(lastNumList[idx])
        }
    }
}