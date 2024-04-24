package com.example.kotlincodingtest.baekjoon.단계별.브루트포스

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    val valList = MutableList<Int>(6){0}
    for (i in 0..5) {
        valList[i] = st.nextToken().toInt()
    }

    val x = (valList[4] * valList[2] - valList[1] * valList[5]) /
            (valList[0] * valList[4] - valList[1] * valList[3])

    var y:Int = 0
    if (valList[1] != 0) {
        y = (valList[2] - valList[0] * x) / valList[1]
    } else {
        y = (valList[5] - valList[3] * x) / valList[4]
    }

    println("$x $y")

}