package com.example.kotlincodingtest.baekjoon.문자열

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val inputString = readLine()
    val sb = StringBuilder()

    inputString.forEach {
        sb.append(if (it.isUpperCase()) it.lowercaseChar() else it.uppercaseChar() )
    }
    println(sb.toString())
}