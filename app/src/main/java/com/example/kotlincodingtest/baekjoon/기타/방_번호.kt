package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine()

    val numList = IntArray(10) { 0 }

    n.forEach {
        numList[it - '0']++
    }

    numList[6] += numList[9]

    if (numList[6] % 2 == 0) {
        numList[6] /= 2
    } else {
        numList[6] = numList[6] / 2 + 1
    }

    println(numList.sliceArray(0 until 9).max())


}