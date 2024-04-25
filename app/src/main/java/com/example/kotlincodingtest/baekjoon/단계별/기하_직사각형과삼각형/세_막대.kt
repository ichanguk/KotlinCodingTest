package com.example.kotlincodingtest.baekjoon.단계별.기하_직사각형과삼각형

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    val lengths = mutableListOf(0, 0, 0)
    var maxLength = 0
    var maxLengthIdx = 0

    for (i in 0..2) {
        lengths[i] = st.nextToken().toInt()
        if (lengths[i] > maxLength) {
            maxLength = lengths[i]
            maxLengthIdx = i
        }
    }

    var otherSum = 0
    for (i in 0..2) {
        if (i == maxLengthIdx) {
            continue
        }
        otherSum += lengths[i]
    }

    if (maxLength >= otherSum) {
        println(otherSum * 2 - 1)
    } else {
        println(otherSum + maxLength)
    }

}