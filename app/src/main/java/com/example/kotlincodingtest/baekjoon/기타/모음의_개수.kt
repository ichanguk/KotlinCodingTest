package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    while(true) {
        val input = readLine()
        if (input == "#") {
            break
        }
        var cnt = 0
        val vowel = mutableSetOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        input.forEach {
            if (it in vowel) {
                cnt++
            }
        }
        println(cnt)
    }
}