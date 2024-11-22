package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var ans = 0
    repeat(8) {
        val input = readLine()

        for (i in (it % 2) until 8 step 2) {
            if (input[i] == 'F') {
                ans++
            }
        }
    }

    println(ans)

}