package com.example.kotlincodingtest.baekjoon.문자열

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()
    var inputString: String? = null
    for (i in 1..T) {
        inputString = readLine()
        print(inputString.first())
        println(inputString.last())
    }
}