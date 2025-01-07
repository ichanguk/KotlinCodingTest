package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var birds = readLine().toInt()

    var ans = 0
    var cur = 1

    while (birds > 0) {
        if (birds >= cur) {
            birds -= cur
            cur++
            ans++
        } else {
            cur = 1
        }
    }

    println(ans)
}