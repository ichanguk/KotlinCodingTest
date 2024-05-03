package com.example.kotlincodingtest.baekjoon.단계별.재귀

import java.io.BufferedReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var input:String? = readLine()
    while(!input.isNullOrEmpty()) {
        if (input == "0") {
            println("-")
        } else {
            Cantor("-", 1, input.toInt())
        }
        input = readLine()
    }
}

fun Cantor(prevString:String, cnt: Int, N: Int) {
    val sb = StringBuilder()
    sb.append(prevString)
    for (i in 1.. prevString.length) {
        sb.append(' ')
    }
    sb.append(prevString)
    if (cnt == N) {
        println(sb.toString())
        return
    }
    Cantor(sb.toString(), cnt + 1, N)
}
