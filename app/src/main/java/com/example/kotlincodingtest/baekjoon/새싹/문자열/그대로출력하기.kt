package com.example.kotlincodingtest.baekjoon.새싹.문자열

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var inputString: String? = readLine()
    while (!inputString.isNullOrEmpty()) {
        println(inputString)
        inputString = readLine()
    }
}