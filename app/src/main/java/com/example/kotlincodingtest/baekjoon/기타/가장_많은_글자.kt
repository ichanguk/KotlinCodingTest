package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var input = readLine()
    val count = IntArray(26) { 0 }
    while (input != null) {
        input.forEach { c ->
            if (c.isLetter()) {
                count[c - 'a']++
            }
        }
        input = readLine()
    }

    val maxCount = count.max()

    for (i in 0 until 26) {
        if (count[i] == maxCount) {
            print('a' + i)
        }
    }

}