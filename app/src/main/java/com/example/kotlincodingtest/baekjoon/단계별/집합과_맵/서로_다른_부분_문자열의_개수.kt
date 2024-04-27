package com.example.kotlincodingtest.baekjoon.단계별.집합과_맵

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val S = readLine()
    val subStringSet = mutableSetOf<String>()

    for (i in 1..S.length) {
        for (j in 0 until S.length) {
            if (j + i > S.length) {
                break
            }
            subStringSet.add(S.substring(j, j + i))
        }
    }
    println(subStringSet.size)
}