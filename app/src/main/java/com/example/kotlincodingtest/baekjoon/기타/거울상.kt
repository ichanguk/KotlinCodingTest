package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var input = readLine()
    val mirrorAlpa = listOf('i', 'o', 'v', 'w', 'x')

    while (input != "#") {
        val sb = StringBuilder()

        for (i in input.length - 1 downTo 0) {
            when (input[i]) {
                'i', 'o', 'v', 'w', 'x' -> sb.append(input[i])
                'b' -> sb.append('d')
                'd' -> sb.append('b')
                'p' -> sb.append('q')
                'q' -> sb.append('p')
                else -> break
            }
        }

        if (sb.length == input.length) {
            println(sb.toString())
        } else {
            println("INVALID")
        }
        input = readLine()
    }
}