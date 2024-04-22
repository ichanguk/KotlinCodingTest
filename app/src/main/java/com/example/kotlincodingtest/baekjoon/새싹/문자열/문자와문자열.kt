package com.example.kotlincodingtest.baekjoon.새싹.문자열

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val S = readLine()
    val i = readLine().toInt() - 1

    println(S[i])
}