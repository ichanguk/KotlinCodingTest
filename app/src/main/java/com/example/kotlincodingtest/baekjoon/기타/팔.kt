package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (L, R) = readLine().split(' ')

    if (L.length != R.length) {
        println(0)
        return@with
    }

    var answer = 0
    for (i in L.indices) {
        if (L[i] == R[i]) {
            if (L[i] == '8') {
                answer++
            }
        } else {
            break
        }
    }
    println(answer)
}